-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 02, 2019 at 04:54 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `TugasBesarDonasiOnline`
--

-- --------------------------------------------------------

--
-- Table structure for table `Akun_Admin`
--

CREATE TABLE `Akun_Admin` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Akun_Admin`
--

INSERT INTO `Akun_Admin` (`username`, `password`) VALUES
('admin', 'admin'),
('rivan', 'rivan');

-- --------------------------------------------------------

--
-- Table structure for table `Akun_Donatur`
--

CREATE TABLE `Akun_Donatur` (
  `nama` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `nohp` varchar(100) NOT NULL,
  `tempat` varchar(100) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Akun_Donatur`
--

INSERT INTO `Akun_Donatur` (`nama`, `email`, `username`, `alamat`, `password`, `gender`, `nohp`, `tempat`, `date`) VALUES
('a', 'a', 'a', 'a', 'a', 'Laki- Laki', '1', '12', '2019-11-27'),
('bismillah', 'bismillah@gmail.com', 'bismillah', 'telkom', '123', 'Perempuan', '1230091', '2019-11-20', '2019-11-20'),
('Ibnu', 'ibnumuzzaky@gmail.com', 'ibnu', 'bandung', '123', 'Laki- Laki', '0124587622', '2000-12-03', '2000-12-03'),
('rivan', 'Rivannurihsan@gmail.com', 'rivannurihsan', 'Subang', '111', 'Laki- Laki', '082121262273', 'Bandung', '2000-09-11');

-- --------------------------------------------------------

--
-- Table structure for table `Akun_Penggalangdana`
--

CREATE TABLE `Akun_Penggalangdana` (
  `nama` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `nohp` varchar(100) NOT NULL,
  `tempat` varchar(100) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Akun_Penggalangdana`
--

INSERT INTO `Akun_Penggalangdana` (`nama`, `email`, `username`, `alamat`, `password`, `gender`, `nohp`, `tempat`, `date`) VALUES
('bowo', 'asd', 'asd', 'asd', 'asd', 'Laki- Laki', '414747', 'Papua', '2026-07-29'),
('Rivan', 'Rivan', 'Rivan', 'Subang', 'Rivan', 'Laki-Laki', '421825', 'Subang', '2000-11-08');

-- --------------------------------------------------------

--
-- Table structure for table `Data_donasi_donatur`
--

CREATE TABLE `Data_donasi_donatur` (
  `judul_event` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `namadonatur` varchar(100) NOT NULL,
  `uangdonasi` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Data_donasi_donatur`
--

INSERT INTO `Data_donasi_donatur` (`judul_event`, `username`, `namadonatur`, `uangdonasi`) VALUES
('Bantu yabi melawan gempa', 'rivannurihsan', 'putra', 1024),
('Bantu Sulawesi Menghadapi Bnjir', 'rivannurihsan', 'yabi', 1425),
('Bantu Sulawesi Menghadapi Bnjir', 'rivannurihsan', 'yabi', 1425);

-- --------------------------------------------------------

--
-- Table structure for table `Event_GalangDana`
--

CREATE TABLE `Event_GalangDana` (
  `kategori` varchar(100) NOT NULL,
  `judul_event` varchar(100) NOT NULL,
  `target_donasi` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tanggalLahir` date NOT NULL,
  `notlp` varchar(100) NOT NULL,
  `lokasi` varchar(100) NOT NULL,
  `tanggalMulai` date NOT NULL,
  `tanggalBerakhir` date NOT NULL,
  `id_perusahaan` varchar(100) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Event_GalangDana`
--

INSERT INTO `Event_GalangDana` (`kategori`, `judul_event`, `target_donasi`, `nama`, `tanggalLahir`, `notlp`, `lokasi`, `tanggalMulai`, `tanggalBerakhir`, `id_perusahaan`, `Username`, `Status`) VALUES
('Kesehatan', 'Bantu yabi melawan gempa', '50000', 'yabi', '2020-11-14', '421825', 'bandung', '2019-11-03', '2020-11-14', '', 'asd', 'Sudah_ACC'),
('Kesehatan', 'Bantu Sulawesi Menghadapi Bnjir', '145200012', 'wawan', '2019-12-04', '0123456785522', 'bandung', '2019-12-03', '2019-12-31', 'if4205', 'asd', 'Sudah_ACC'),
('Kesehatan', 'Bantu Putra Melawan kelaparan', '14523658', 'putra setiadi', '2019-12-31', '12345210', 'Sukabumi', '2019-12-01', '2019-12-31', '', 'Rivan', 'Sudah_ACC');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Akun_Admin`
--
ALTER TABLE `Akun_Admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `Akun_Donatur`
--
ALTER TABLE `Akun_Donatur`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `Akun_Penggalangdana`
--
ALTER TABLE `Akun_Penggalangdana`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
