# PROJECT KELOMPOK 4 (WRRH FUTSAL)

Sebuah proyek aplikasi desktop untuk mengelola booking lapangan futsal dengan mudah dan efisien. Dibuat dengan Java Swing sebagai bagian dari tugas atau proyek belajar Pemrograman Berorientasi Objek.

## Deskripsi Singkat

Capek ngurusin jadwal booking yang bentrok? Atau data pelanggan yang kecatat di kertas dan sering hilang? Aplikasi ini lahir sebagai solusi untuk mempermudah hidup para pengelola lapangan futsal. Dengan aplikasi ini, seorang operator bisa melakukan semua proses manajemen, mulai dari mencatat booking baru, melihat jadwal yang terisi dan yang kosong, hingga mengelola data lapangan dan pelanggan secara terpusat.

Tujuan utamanya adalah mengubah proses yang manual dan rentan error menjadi sebuah sistem yang terstruktur, cepat, dan akurat.

## Fitur Utama

Aplikasi ini dilengkapi dengan beberapa fitur keren:

* **Sistem Login:** Keamanan adalah nomor satu! Hanya operator yang terdaftar yang bisa masuk ke sistem.
* **Manajemen Booking:** Antarmuka yang intuitif untuk memasukkan data booking baru, lengkap dengan pemilihan tanggal, jam, dan durasi.
* **Jadwal Real-time:** Menampilkan jadwal penggunaan lapangan dalam format grid (papan waktu), membedakan slot yang **TERSEDIA** (hijau) dan yang **SEDANG DIGUNAKAN** (merah).
* **Manajemen Lapangan:** Melihat daftar lapangan beserta harga sewa dan status ketersediaannya saat ini juga (*real-time*).
* **Manajemen Customer:** Data pelanggan baru otomatis tersimpan saat melakukan booking pertama kali, memudahkan untuk pencatatan riwayat.
* **Cetak Struk Digital:** Setelah booking berhasil, aplikasi akan menampilkan struk digital yang berisi rincian transaksi.

* 1. Form Booking Utama**
*(Tempat operator melakukan semua keajaiban booking)*

![image](https://github.com/user-attachments/assets/bc6e3774-5f05-4f2e-bc03-643b182f4ecc)


**2. Laporan Status Lapangan**
*(Melihat lapangan mana yang nganggur dan mana yang lagi dipakai)*

![image](https://github.com/user-attachments/assets/8bd83812-ed68-4472-b672-b31ffc196b50)


**3. Tampilan Jadwal Harian**
*(Papan waktu interaktif untuk melihat jadwal dalam satu hari penuh)*

![image](https://github.com/user-attachments/assets/e245e777-651c-459e-b6c8-ceecdc63349c)


**4. Struk Booking Digital**
*(Bukti transaksi yang muncul setelah booking berhasil)*

![image](https://github.com/user-attachments/assets/bc4c8c2b-8646-4588-b88d-fa946321e2e6)

## Teknologi yang Digunakan

Proyek ini dibangun dengan teknologi dan library berikut:

* **Bahasa:** Java (menggunakan JDK 1.8)
* **Framework/Library UI:** Java Swing (GUI bawaan Java)
* **Database:** MySQL / MariaDB
* **IDE:** Apache NetBeans IDE
* **Library Tambahan:**
    * `MySQL Connector/J`: Untuk menjembatani aplikasi Java dengan database MySQL.
    * `JCalendar 1.4`: Untuk komponen pemilih tanggal (`JDateChooser`) yang keren.

## Cara Setup dan Menjalankan Proyek

Ingin mencoba aplikasi ini di komputermu? Ikuti langkah-langkah berikut:

1.  **Prasyarat:**
    * Pastikan sudah ter-install [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/javase-downloads.html).
    * Install [Apache NetBeans IDE](https://netbeans.apache.org/).
    * Install [XAMPP](https://www.apachefriends.org/) untuk menjalankan server Apache dan MySQL.

2.  **Setup Database:**
    * Jalankan XAMPP Control Panel, lalu start modul **Apache** dan **MySQL**.
    * Buka browser dan pergi ke `http://localhost/phpmyadmin`.
    * Buat database baru dengan nama `db_futsal`.
    * Pilih database `db_futsal`, lalu pergi ke tab **SQL** dan jalankan script di bawah ini untuk membuat semua tabel yang dibutuhkan. *(Anda bisa menyembunyikan script SQL ini dengan tag `<details>` jika terlalu panjang)*.

    <details>
    <summary>Klik untuk melihat Script SQL</summary>

    ```sql
    CREATE TABLE admin (
      id_admin int(11) NOT NULL AUTO_INCREMENT,
      username varchar(50) NOT NULL,
      password varchar(255) NOT NULL,
      PRIMARY KEY (id_admin)
    );

    CREATE TABLE lapangan (
      id_lapangan int(11) NOT NULL AUTO_INCREMENT,
      nama_lapangan varchar(100) NOT NULL,
      harga int(11) NOT NULL,
      PRIMARY KEY (id_lapangan)
    );
    
    CREATE TABLE customer (
      id_customer int(11) NOT NULL AUTO_INCREMENT,
      nama_customer varchar(100) NOT NULL,
      no_telepon varchar(15) NOT NULL,
      PRIMARY KEY (id_customer),
      UNIQUE KEY (no_telepon)
    );

    CREATE TABLE booking (
      id_booking int(11) NOT NULL AUTO_INCREMENT,
      id_lapangan int(11) NOT NULL,
      id_customer int(11) NOT NULL,
      tanggal_booking date NOT NULL,
      jam_mulai time NOT NULL,
      jam_selesai time NOT NULL,
      total_biaya int(11) NOT NULL,
      status varchar(20) NOT NULL,
      PRIMARY KEY (id_booking),
      FOREIGN KEY (id_lapangan) REFERENCES lapangan(id_lapangan),
      FOREIGN KEY (id_customer) REFERENCES customer(id_customer)
    );

    -- Jangan lupa buat user admin pertama kali!
    INSERT INTO `admin` (`username`, `password`) VALUES ('admin', MD5('admin'));
    ```
    </details>

3.  **Setup Proyek:**
    * Clone repositori ini: `git clone https://github.com/Dannn65/project_kelompok_4`
    * Buka proyeknya melalui NetBeans (`File > Open Project...`).
    * Klik kanan pada folder **Libraries** di dalam proyek, pilih **Add JAR/Folder...**, lalu tambahkan file `mysql-connector-j-x.x.x.jar` dan `jcalendar-1.4.jar`.

4.  **Konfigurasi Koneksi:**
    * Buka file `DBConnection.java`. Pastikan nama database (`db_futsal`), user (`root`), dan password (`""`) sudah sesuai dengan konfigurasi XAMPP Anda.

5.  **Jalankan!**
    * Klik kanan pada file yang berisi `main method` (misalnya `LoginForm.java` atau `Main.java`), lalu pilih **Run File**.

## Penulis

Dibuat oleh **kelompok 4**

* GitHub: @Dannn65(https://github.com/Dannn65)

---

