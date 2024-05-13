package com.example.tugasku.data

import com.example.tugasku.R
import com.example.tugasku.item.Drama
import com.example.tugasku.item.Ost
import com.example.tugasku.item.Penyanyi
import com.example.tugasku.item.Profile

object DataAwal {
    val tugasProfile = listOf(
        Profile(
            id = 1,
            name = "DZHATUN NITHA QHAINI",
            email = "nithaqhaini@gmail.com",
            kampus = "Politeknik Negeri Batam",
            jurusan = "Teknologi Rekayasa Multimedia",
            catatan = "Kalo kata Jisung, 'Ada pepatah yang mengatakan kita tidak akan melupakan seseorang yang memperluas dunia kita, " +
                    "Saya harap mentor IL juga merasakan itu, semoga sehat selalu ya, " +
                    "maaf klo masih banyak kurangngya (baru tidak eror 30 menit sblm DL, MAKASIH BANYAK ^_^)' ",
            photo = R.drawable.dzatun
        ),
    )
    val tugasOst = listOf(
        Ost(
            id = 1,
            title =  "Lady Luck",
            tahunrilis = 2014 ,
            penyanyi = "EXO, Chen",
            photo= R.drawable.bestluck
        ),
        Ost(
            id = 2,
            title =  "Perhaps Love",
            tahunrilis = 2006 ,
            penyanyi = "J dan HawL",
            photo= R.drawable.perhapslove
        ),
        Ost(
            id = 3,
            title =  "Say Yes",
            tahunrilis = 2016 ,
            penyanyi = "Loco And Punch",
            photo= R.drawable.sayyes
        ),
        Ost(
            id = 4,
            title =  "Destiny Tells Me",
            tahunrilis = 2019 ,
            penyanyi = "Heize",
            photo= R.drawable.destinytellsme
        ),
        Ost(
            id = 5,
            title =  "All For You",
            tahunrilis = 2012 ,
            penyanyi = "Jung Eun Ji dan Seo In-guk",
            photo= R.drawable.allforyou
        ),
        Ost(
            id = 6,
            title =  "Starlight",
            tahunrilis = 2022,
            penyanyi ="anggota tertua dari grup NCT yakni Taeil",
            photo= R.drawable.starlight
        ),
        Ost(
            id = 7,
            title =  "Confession is Not Flashy",
            tahunrilis =2020 ,
            penyanyi = "Anggota dari boyband Super Junior Kyuhyun ",
            photo= R.drawable.confessionisnotflashy
        ),
        Ost(
            id = 8,
            title =  "The Reasons of My Smiles",
            tahunrilis = 2024 ,
            penyanyi = " Unit boy group SEVENTEEN yakni BSS (Seungkwan, Hoshi, dan DK)",
            photo= R.drawable.thereasonsofmysmiles
        ),
        Ost(
            id = 9,
            title =   "Hold Me Back",
            tahunrilis = 2024 ,
            penyanyi = "Heize",
            photo= R.drawable.holdmeback
        ),
        Ost(
            id = 10,
            title =   "Bravo, My Life",
            tahunrilis = 2017 ,
            penyanyi ="Eric Nam ",
            photo= R.drawable.bravomylife
        ),
    )

    val tugasPenyanyi = listOf(
        Penyanyi(
            id = 1,
            name = "Chen",
            debut = 2011,
            photo = R.drawable.chen
        ),
        Penyanyi(
            id = 2,
            name = "Eric Nam",
            debut = 2011,
            photo = R.drawable.ericnam
        ),
        Penyanyi(
            id = 3,
            name = "Jung Eun-ji",
            debut = 2011,
            photo = R.drawable.jungeunji
        ),
        Penyanyi(
            id = 4,
            name = "Punch" ,
            debut = 2014,
            photo = R.drawable.punch
        ),
        Penyanyi(
            id = 5,
            name = "Loco",
            debut = 2012,
            photo = R.drawable.loco
        ),
        Penyanyi(
        id = 6,
        name = "Heizy ",
        debut = 2014,
        photo = R.drawable.heizy
    ),
        Penyanyi(
            id = 7,
            name = "Cho Kyu-Hyun",
            debut = 2006,
            photo = R.drawable.kyuhyun
        ),
        Penyanyi(
            id = 9,
            name = "Hoshi",
            debut = 2015,
            photo = R.drawable.hoshi
        ),
        Penyanyi(
            id = 10,
            name = "DK ",
            debut = 2015,
            photo = R.drawable.dk
        ),
        Penyanyi(
            id = 11,
            name = "Boo Seungkwan ",
            debut = 2015,
            photo = R.drawable.seungkwan
        ),
        Penyanyi(
            id = 12,
            name = "Aille ",
            debut = 2012,
            photo = R.drawable.ilee
        ),
        Penyanyi(
            id = 13,
            name = "Lyn" ,
            debut = 2001,
            photo = R.drawable.lyn
        ),
        Penyanyi(
            id = 14,
            name = "Hyorin" ,
            debut = 2010,
            photo = R.drawable.hyorin,
        ),
    )

    val tugasDrama= listOf(
        Drama(
            id = 1,
            title = "Queen of Tears",
            tahunrilis = 2024,
            sinopsis = "Kisah kehidupan pasangan suami istri yang menghadapi konflik di usia tiga tahun pernikahannya.\n" +
                    "Mereka adalah Baek Hyun Woo dan Hong Hae In. Keduanya berasal dari keluarga dengan dunia dengan latar belakang yang berbeda,\n" +
                    "yang dipersatukan dalam ikatan pernikahan penuh suka cita",
            photo = R.drawable.queenfftears
        ),
        Drama(
            id = 2,
            title = "Reply 1988",
            tahunrilis = 2015,
            sinopsis = "Persahabatan antara lima remaja SMA yang hidup bertetangga di Ssangmun-dong, distrik Dobong, Seoul bagian utara.\n" +
                    "Deok Sun, Jeong Hwan, Sun Woo, Dong Ryong, dan Choi Taek tumbuh bersama sejak kecil.\n" +
                    "Kelimanya kerap berkeliaran dan bermain di kamar Taek untuk menghabiskan waktu bersama,\n" +
                    "sehingga keluarga mereka pun sangat dekat satu sama lain.",
            photo = R.drawable.reply1988
        ),
        Drama(
            id = 3,
            title = "Playfull Kiss",
            tahunrilis = 2010,
            sinopsis = "kisah gadis SMA bernama Oh Ha Ni (Jung So Min) yang jatuh cinta pada Baek Seung Jo (Kim Hyun Joong),\n" +
                    "siswa terpintar di sekolahnya Oh Ha Ni dikisahkan sebagai seorang siswi SMA yang jatuh cinta pada Baek Seung Jo yang perfeksionis",
            photo = R.drawable.playfullkiss
        ),
        Drama(
            id = 4,
            title = "Who Are You, School 2017",
            tahunrilis = 2010,
            sinopsis = "Sepasang anak kembar bernama Go Eun Byul dan Lee Eun Bi (keduanya diperankan Kim So Hyun) Keduanya terpisah sejak kecil karena tinggal di panti asuhan berbeda" +
                    "Eun Bi tinggal dan besar di panti asuhan Love House di Tongyeong, Provinsi Gyeongsang Selatan.Anak-anak panti lainnya menganggap Eun Bi sebagai sosok ibu.\n" +
                    "Sementara Eun Bi menyembunyikan kenyataan kalau dirinya menjadi korban bully Kang So Young (Jo Soo Hyang) dan kawan-kawannya.\n" +
                    "Eun Byul diadopsi Song Mi Gyeong (Jeon Mi Sun) dan tumbuh dewasa di Seoul....",
            photo = R.drawable.school2017
        ),
        Drama(
            id = 5,
            title = "When the Camellia Blooms",
            tahunrilis = 2019,
            sinopsis = "Dong-Baek yang merupakan seorang ibu tunggal yang tinggal di kota kecil Ongsan.\n" +
                    "Dia menjalankan bar-restoran Camellia sembari merawat putranya yang bernama Pil-Gu. \n" +
                    "Masyarakat Ongsan sering bergosip tentang Dong-Baek.",
            photo = R.drawable.whencamelliablooms
        ),
        Drama(
            id = 6,
            title = "Moving",
            tahunrilis = 2023,
            sinopsis = "tiga remaja SMA bernama Kim Bong-seok (Kim Do-hoon), Jang Hui-soo (Go Youn-jung), dan Shin Jae-hyun (Lee Jung-ha) yang memiliki kekuatan super.\n" +
                    "Bong-seok dapat melayang, Hui-soo dapat bertahan hidup dari kecelakaan mobil yang mematikan, dan Jae-hyun dapat melihat masa depan.\n" +
                    "Ketiga remaja ini mencoba untuk menjalani kehidupan normal dan merahasiakan kekuatan super mereka.\n " +
                    "Namun, mereka harus menghadapi berbagai tantangan, termasuk organisasi misterius yang memburu orang-orang dengan kekuatan super.",
            photo = R.drawable.moving
        ),
        Drama(
            id = 7,
            title = "Playfull Kiss",
            tahunrilis = 2020,
            sinopsis = "Hospital Playlist bercerita tentang lima dokter yang telah berteman sejak mereka memasuki sekolah kedokteran pada tahun 1999.\n" +
                    " Kelimanya terus menjalin hubungan pertemanan yang sangat dekat hingga menjadi dokter spesialis dan bekerja di rumah sakit yang sama.\n " +
                    "Terlebih, mereka selalu ada satu sama lain ketika hidup terasa sulit baik soal pemeriksaan pasien maupun tentang operasi.\n" +
                    "Setiap pemeran utama selalu bersikap profesional dalam pekerjaannya, Namun,mereka selalu berusaha menjalin hubungan dekat satu sama lain \n" +
                    "dengan kerap makan bersama dan bermain musik di akhir pekan jika tidak berhalangan",
            photo = R.drawable.hospitalplaylist
        ),
        Drama(
            id = 8,
            title = "Hi Bye Mama",
            tahunrilis = 2020,
            sinopsis = "Seorang ibu yang telah meninggal dan diberikan kesempatan untuk hidup kembali oleh dewa bernama Cha Yuri. \n" +
                    "Dan tentu saja sosok Cha Yuri sangat merasa bahagia karena dia bisa menjadi manusia kembali. \n" +
                    "Sehingga putrinya yang masih balita yaitu Cho Seo Woo dapat melihatnya.\n" +
                    "Tentu saja kembalinya sang istri yang telah meninggal membuat sang suami Cha Yu-ri yaitu Jo Kang Hwa merasa kaget. \n" +
                    "Apalagi status Kang Hwa yang telah memiliki istri baru.",
            photo = R.drawable.hibyemama
        ),
        Drama(
            id = 9,
            title = "Fight For My Way",
            tahunrilis = 2017,
            sinopsis = "Ini adalah kisah tentang anak muda yang berusaha mencapai impian mereka terlepas dari keadaan, serta bagaimana mereka menemukan cinta dan persahabatan di sepanjang prosesnya.\n" +
                    "Berfokus pada kehidupan Go Dong Man (Park Seo Joon) dan Choi Ae Ra (Kim Ji Won) yang berteman sejak mereka masih kecil dan bisa dibilang seperti saudara kandung.\n" +
                    "Namun, keduanya jatuh cinta satu sama lain saat proses menggapai impian mereka.\n",
            photo = R.drawable.fightformyway
        ),
        Drama(
            id = 10,
            title = "Weightlifting Fairy Kim Bok Joo",
            tahunrilis = 2010,
            sinopsis = "Kim Bok-joo (Lee Sung-kyung) adalah seorang mahasiswi di Universitas Olahraga Haneol. Dia memiliki kekuatan melebihi anak-anak lainnya sejak dia masih kecil.\n" +
                    " Hal ini juga dipengaruhi oleh ayahnya yang dulunya merupakan seorang atlet angkat besi. Ibunya telah meninggal semenjak dia masih kecil.\n" +
                    " Jadi ayahnya membuka sebuah restoran ayam, Bok Chicken, untuk membiayai kehidupan mereka. Dia terlihat seperti seorang gadis yang ceroboh,\n " +
                    "tetapi sebenarnya cukup peka dan seorang pemerhati yang baik.",
            photo = R.drawable.weightliftingkimbokjoo
        ),
    )
}

