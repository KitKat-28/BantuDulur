package com.example.bantudulur

object BantuDulurData {

    private val dulurNames = arrayOf(
        "Bantu Pengobatan Korban Kebakaran",
        "Bantu Korban Angin Puting Beliung",
        "Bantu Kelaparan Pengungsi Rohingya ",
        "Bantu Penyitas Kanker Untuk Bangkit",
        "Bantu Korban Gemba Bumi Lombok",
        "Bantu Korban Banjir Jakarta",
        "Bantu Donor Darahmu Untuk RS Indonesia",
        "Bantu Sekolah PETRA untuk Korban Gempa",
        "Bantu Makanan Gelandangan/Pengemis",
        "Bantu Relawan Bencana Tetap Prima"
    )

    private val dulurDetails = arrayOf(
        "Kabid Humas Polda Metro Jaya Kombes Argo Yuwono mengatakan, kebakaran yang terjadi pada pukul 08.30 WIB itu dipicu bunga api yang berasal dari mesin las. Pacsakebakaran, para korban langsung dilarikan ke rumah sakit terdekat, namun karena mayoritas korban sudah tak utuh maka dirujuk ke RS Polri Kramat Jati, Jakarta Timur.\n" +
                "Setelah diidentifikasi, akhirnya diketahui bahwa 49 orang tewas dan 40 orang lebih mengalami luka-luka.\n" + "Mari Ulurkan Bantuan dengan memberikan donasi seikhlasnya untuk saudara kita yang terluka.",
        "Setelah di terjang angin, terlihat belasan rumah warga yang ada di Tegal Binagun, Plaju ikut roboh. Rumah yang roboh dan atapnya terbang itu rata-rata terbuat dari kayu.\n" +
                "\n" + "Selain rumah kayu terlihat pula beberapa rumah permanen yang di bagian atapnya terbuat dari rangka baja. Tidak ada korban jiwa akibat kejadian ini.\n" + "Mari ulurkan Bantuan dengan memberikan donasi seikhlasnya untuk saudara kita yang terluka.",
        "Penjaga pantai Bangladesh mengatakan, pihaknya telah menyelamatkan setidaknya 382 pengungsi Rohingya yang kelaparan. Mereka hanyut di lautan selama hampir dua bulan.\n"+
                "\n" + "Mari Ulurkan Bantuan dengan memberikan donasi seikhlasnya untuk saudara kita yang terluka.",
        "Kanker payudara merupakan penyakit mematikan setelah serangan jantung. Begitu banyak penyintas kanker payudara yang berhasil sembuh. Namun, tidak sedikit juga pasien yang gugur setelah berjuang melawan kanker selama bertahun-tahun. Mereka membutuhkan support dari kita\n"+
                "\n" + "\"Mari Ulurkan Bantuan dengan memberikan donasi seikhlasnya untuk saudara kita yang sakit.",
        "Satu minggu berlalu setelah lindu terjadi di Lombok, Nusa Tenggara Barat, Sahril dan keluarganya belum mendapat tempat pengungsian yang layak. Sahril, yang merupakan warga Desa Wadon, Kecamatan Gunung Sari, Lombok Utara, harus tinggal di tenda terpal ala kadarnya seusai gempa Lombok.\n"+
                "\n" + "Mari Ulurkan Bantuan dengan memberikan donasi seikhlasnya untuk saudara kita yang terluka.",
        "Banjir yang menerjang DKI Jakarta dan sekitarnya pada Sabtu lalu membuat ratusan orang harus mengungsi. Menurut data yang dikeluarkan oleh Basarnas, jumlah korban banjir yang dievakuasi untuk mengungsi mencapai angka 856 jiwa. Yusuf menerangkan ratusan pengungsi banjir tersebut berasal dari Jakarta Selatan, Jakarta Timur, Tangerang, dan Bekasi.\n" +
                "\n" + "Mari Ulurkan Bantuan dengan memberikan donasi seikhlasnya untuk saudara kita yang mengungsi karena kebanjiran.",
        "URGENT. Selamat siang kawan-kawan semua. Saat ini ayah saya atas nama Didik H membutuhkan plasma convalescent dengan Gol darah O rehesus +. Ayah saya saat ini dirawat di ICU RS Fatmawati. Adapun donor yang kami cari memiliki syarat: 1. Pernah terjangkit Covid 19 dan sudah swab evaluasi dengan hasil negatif. 2. Golongan darah O. 3. Laki-laki. \n" +
                "\n" + "Mari Ulurkan Bantuan dengan memberikan donasi seikhlasnya untuk saudara kita yang membutuhkan donor darah.",
        "Bencana berarti juga terhambatnya laju pembangunan. Berbagai hasil pembangunan ikut menjadi korban sehingga perlu adanya proses membangun ulang. Siswa pun harus terpaksa berhenti sekolah. Kenyataan seperti ini berarti pula muncul kemungkinan kegagalan di masa mendatang. Dari berbagai masalah seperti itu bisa menyebabkan timbulnya trauma\n" +
                "\n" + "Mari Ulurkan Bantuan dengan memberikan donasi seikhlasnya untuk saudara kita korban bencana alam untuk tetap sekolah",
        "Banyaknya gelandangan di ibukota sering sekali makan dari makanan yang tidak layak. Mereka juga sering tidak mendapatkan pakaian yang layak. Sehingga banyak dari mereka yang hidup dengan penderitaan. Banyaknya gelandangan yang mencari-cari sisa makanan di tempat sampah, yang berada di depan restoran.\n" +
                "\n" + "Mari Ulurkan Bantuan dengan memberikan donasi seikhlasnya untuk gelandangan, agar bisa makan dengan layak.",
        "Relawan Penanggulangan Bencana, yang selanjutnya disebut relawan, adalah seorang atau sekelompok orang yang memiliki kemampuan dan kepedulian untuk bekerja secara sukarela dan ikhlas dalam upaya penanggulangan bencana.Mereka membutuhkan support dari kita.Dari berbagai masalah seperti itu bisa menyebabkan timbulnya penyakit untuk mereka\n" +
                "\n" + "Mari Ulurkan Bantuan dengan memberikan donasi seikhlasnya untuk relawan.")

    private val dulurPhoto= intArrayOf(
            R.drawable.kebakaran,
            R.drawable.tornado,
            R.drawable.pengungsian,
            R.drawable.kanker,
            R.drawable.gempa,
            R.drawable.banjir,
            R.drawable.donordarah,
            R.drawable.pengungsian,
            R.drawable.kelaparan2,
            R.drawable.kebakaran2
        )

    val listData: ArrayList<BantuDulur>
        get() {
            val list = arrayListOf<BantuDulur>()
            for (position in dulurNames.indices) {
                val bantudulur = BantuDulur()
                bantudulur.tittle = dulurNames[position]
                bantudulur.detail = dulurDetails[position]
                bantudulur.photo = dulurPhoto[position]
                list.add(bantudulur)
            }
            return list
        }





}