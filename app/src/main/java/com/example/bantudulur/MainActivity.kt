package com.example.bantudulur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvBantuDulur: RecyclerView
    private var list: ArrayList<BantuDulur> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBantuDulur = findViewById(R.id.rvBantuDulur)
        rvBantuDulur.setHasFixedSize(true)

        list.addAll(BantuDulurData.listData)
        showRecyclerCard()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.profile){
            val moveToProfile = Intent (this@MainActivity, Profile::class.java)
            startActivity(moveToProfile)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerCard(){
        rvBantuDulur.layoutManager = LinearLayoutManager(this)
        val BantuDulurAdapter = BantuDulurAdapter(list)
        rvBantuDulur.adapter = BantuDulurAdapter

        BantuDulurAdapter.setOnItemClickCallBack(object : BantuDulurAdapter.OnItemClickCallBack{
            override fun onItemClicked (data : BantuDulur){
                val BantuDulurIntent = Intent(this@MainActivity, DetailActivity::class.java)
                BantuDulurIntent.putExtra(DetailActivity.EXTRA_PHOTO,data.photo)
                BantuDulurIntent.putExtra(DetailActivity.EXTRA_TITTLE,data.tittle)
                BantuDulurIntent.putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
                startActivity(BantuDulurIntent)

            }
        })


    }




}