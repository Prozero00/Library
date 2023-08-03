-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 03, 2023 at 11:09 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `id_anggota` int(11) NOT NULL,
  `NIM` int(11) NOT NULL,
  `nama_anggota` varchar(50) NOT NULL,
  `id_prodi` int(11) NOT NULL,
  `no_telepon` varchar(12) NOT NULL,
  `email` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`id_anggota`, `NIM`, `nama_anggota`, `id_prodi`, `no_telepon`, `email`, `alamat`) VALUES
(13, 2111081003, 'Aufa', 1, '657546356', 'sadasdasda', 'sdsadas'),
(15, 212213321, 'Nadia', 20, '08123123', 'Nadia@gmail.com', 'Padang\n');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` int(11) NOT NULL,
  `judul` varchar(50) NOT NULL,
  `pengarang` varchar(20) NOT NULL,
  `penerbit` varchar(50) NOT NULL,
  `tahun_terbit` varchar(4) NOT NULL,
  `jumlah_buku` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `pengarang`, `penerbit`, `tahun_terbit`, `jumlah_buku`) VALUES
(1, 'Java edisi ', 'lisa', 'gramed', '2002', 5),
(2, 'Perl Harbor', 'Mona', 'PT. Indah Bersama', '2000', 5),
(5, 'Star Wars', 'Lucasfilm', 'Lucasfilm', '1984', 6);

-- --------------------------------------------------------

--
-- Table structure for table `jurusan`
--

CREATE TABLE `jurusan` (
  `id_jurusan` int(11) NOT NULL,
  `nama_jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jurusan`
--

INSERT INTO `jurusan` (`id_jurusan`, `nama_jurusan`) VALUES
(1, 'Teknik Mesin'),
(2, 'Teknik Sipil'),
(3, 'Teknik Elektro'),
(4, 'Administrasi Niaga'),
(5, 'Akutansi'),
(6, 'Teknologi Informasi'),
(7, 'Bahasa Inggris');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_peminjaman` int(11) NOT NULL,
  `id_anggota` int(11) NOT NULL,
  `id_buku` int(11) NOT NULL,
  `id_staf` int(11) NOT NULL,
  `tgl_peminjaman` date NOT NULL DEFAULT current_timestamp(),
  `jatuh_tempo` date NOT NULL DEFAULT current_timestamp(),
  `tgl_pengembalian` date DEFAULT NULL,
  `jumlah_hari` int(11) DEFAULT NULL,
  `total_denda` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`id_peminjaman`, `id_anggota`, `id_buku`, `id_staf`, `tgl_peminjaman`, `jatuh_tempo`, `tgl_pengembalian`, `jumlah_hari`, `total_denda`) VALUES
(13, 13, 2, 2, '2023-06-10', '2023-06-17', '2023-06-22', 5, 15000),
(16, 15, 2, 1, '2023-07-17', '2023-07-24', '2023-07-28', 4, 12000);

-- --------------------------------------------------------

--
-- Table structure for table `prodi`
--

CREATE TABLE `prodi` (
  `id_prodi` int(11) NOT NULL,
  `nama_prodi` varchar(60) NOT NULL,
  `id_jurusan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prodi`
--

INSERT INTO `prodi` (`id_prodi`, `nama_prodi`, `id_jurusan`) VALUES
(1, 'D3 Teknik', 1),
(2, 'D3 Teknik Alat Berat', 1),
(3, 'D4 Teknik Manufaktur', 1),
(4, 'D3 Teknik Sipil', 2),
(5, 'D4 Teknik Perencanaan Irigasi dan Rawa', 2),
(6, 'D4 Manajemen Rekayasa Konstruksi', 2),
(7, 'D4 Perancangan Jalan dan Jembatan', 2),
(8, 'D3 Teknik Listrik', 3),
(9, 'D3 Teknik Elektronika', 3),
(10, 'D3 Teknik Telekomunikasi', 3),
(11, 'D4 Teknik Elektronika', 3),
(12, 'D3 Administrasi Bisnis', 4),
(13, 'D3 Usaha Perjalanan Wisata', 4),
(14, 'D4 Destinasi Pariwisata', 4),
(15, 'D3 Akutansi', 5),
(16, 'D4 Akutansi', 5),
(17, 'Magister Terapan Sistem Informasi Akuntansi', 5),
(18, 'D3 Teknik Komputer', 6),
(19, 'D3 Manajemen Informatika', 6),
(20, 'D4 Teknologi Rekayasa Perangkat Lunak', 6),
(21, 'D3 Bahasa Inggris', 7),
(22, 'D4 Bahasa Inggris untuk Komunikasi Bisnis dan Profesional', 7);

-- --------------------------------------------------------

--
-- Table structure for table `staf`
--

CREATE TABLE `staf` (
  `id_staf` int(11) NOT NULL,
  `nama_staf` varchar(50) NOT NULL,
  `jekel` enum('Pria','Wanita') NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staf`
--

INSERT INTO `staf` (`id_staf`, `nama_staf`, `jekel`, `alamat`) VALUES
(1, 'Aufa', 'Pria', 'Padang'),
(2, 'Luke', 'Pria', 'Solok'),
(5, 'Laras', 'Wanita', 'Jl. M Hatta No. 1, Padamg');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UID` int(11) NOT NULL,
  `USERNAME` varchar(30) NOT NULL,
  `PASSWORD` varchar(30) NOT NULL,
  `USER_TYPE` enum('Admin','User') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UID`, `USERNAME`, `PASSWORD`, `USER_TYPE`) VALUES
(3, 'Loki', '12345', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_anggota`),
  ADD UNIQUE KEY `NIM` (`NIM`),
  ADD KEY `id_prodi` (`id_prodi`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indexes for table `jurusan`
--
ALTER TABLE `jurusan`
  ADD PRIMARY KEY (`id_jurusan`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`),
  ADD KEY `id_anggota` (`id_anggota`),
  ADD KEY `id_buku` (`id_buku`),
  ADD KEY `id_staf` (`id_staf`);

--
-- Indexes for table `prodi`
--
ALTER TABLE `prodi`
  ADD PRIMARY KEY (`id_prodi`),
  ADD KEY `id_jurusan` (`id_jurusan`);

--
-- Indexes for table `staf`
--
ALTER TABLE `staf`
  ADD PRIMARY KEY (`id_staf`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `anggota`
--
ALTER TABLE `anggota`
  MODIFY `id_anggota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `id_buku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `jurusan`
--
ALTER TABLE `jurusan`
  MODIFY `id_jurusan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `prodi`
--
ALTER TABLE `prodi`
  MODIFY `id_prodi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `staf`
--
ALTER TABLE `staf`
  MODIFY `id_staf` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `UID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `anggota`
--
ALTER TABLE `anggota`
  ADD CONSTRAINT `anggota_ibfk_1` FOREIGN KEY (`id_prodi`) REFERENCES `prodi` (`id_prodi`);

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`id_anggota`) REFERENCES `anggota` (`id_anggota`),
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`id_buku`) REFERENCES `buku` (`id_buku`),
  ADD CONSTRAINT `peminjaman_ibfk_3` FOREIGN KEY (`id_staf`) REFERENCES `staf` (`id_staf`);

--
-- Constraints for table `prodi`
--
ALTER TABLE `prodi`
  ADD CONSTRAINT `prodi_ibfk_1` FOREIGN KEY (`id_jurusan`) REFERENCES `jurusan` (`id_jurusan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
