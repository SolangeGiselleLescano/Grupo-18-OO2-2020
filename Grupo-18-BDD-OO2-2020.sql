-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.48 - MySQL Community Server (GPL)
-- Server OS:                    Linux
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for Grupo-18-OO2-2020_v1.0
DROP DATABASE IF EXISTS `Grupo-18-OO2-2020_v1.0`;
CREATE DATABASE IF NOT EXISTS `Grupo-18-OO2-2020_v1.0` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `Grupo-18-OO2-2020_v1.0`;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.clientes
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `cliente_fecha_ultima_compra` datetime DEFAULT NULL,
  `clientes_persona_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`clientes_persona_id`) USING BTREE,
  UNIQUE KEY `clientes_dni_UNIQUE` (`clientes_persona_id`) USING BTREE,
  CONSTRAINT `fk_c_personas_idx` FOREIGN KEY (`clientes_persona_id`) REFERENCES `personas` (`personas_dni`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.clientes: ~0 rows (approximately)
DELETE FROM `clientes`;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.empleados
DROP TABLE IF EXISTS `empleados`;
CREATE TABLE IF NOT EXISTS `empleados` (
  `empleados_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `empleados_persona_id` int(10) unsigned NOT NULL,
  `empleados_tipo_empleado` int(10) unsigned NOT NULL,
  `empleados_fecha_ingreso` varchar(45) NOT NULL,
  `empleados_sueldo_basico` decimal(13,2) NOT NULL DEFAULT '0.00',
  `empleados_franjas_horarias_id` int(1) unsigned NOT NULL,
  PRIMARY KEY (`empleados_id`),
  KEY `fk_e_tipos_empleados_idx` (`empleados_tipo_empleado`),
  KEY `fk_e_franjas_horarias_idx` (`empleados_franjas_horarias_id`),
  KEY `fk_e_personas_idx` (`empleados_persona_id`) USING BTREE,
  CONSTRAINT `fk_e_franjas_horarias_idx` FOREIGN KEY (`empleados_franjas_horarias_id`) REFERENCES `franjas_horarias` (`franjas_horarias_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_e_personas_idx` FOREIGN KEY (`empleados_persona_id`) REFERENCES `personas` (`personas_dni`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_e_tipos_empleados_idx` FOREIGN KEY (`empleados_tipo_empleado`) REFERENCES `tipos_empleados` (`tipo_empleado_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.empleados: ~1 rows (approximately)
DELETE FROM `empleados`;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` (`empleados_id`, `empleados_persona_id`, `empleados_tipo_empleado`, `empleados_fecha_ingreso`, `empleados_sueldo_basico`, `empleados_franjas_horarias_id`) VALUES
	(1, 1, 1, '2020-02-05', 0.00, 1);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.estados_solicitudes
DROP TABLE IF EXISTS `estados_solicitudes`;
CREATE TABLE IF NOT EXISTS `estados_solicitudes` (
  `estados_solicitudes_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `estados_solicitudes_descripcion` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`estados_solicitudes_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.estados_solicitudes: ~4 rows (approximately)
DELETE FROM `estados_solicitudes`;
/*!40000 ALTER TABLE `estados_solicitudes` DISABLE KEYS */;
INSERT INTO `estados_solicitudes` (`estados_solicitudes_id`, `estados_solicitudes_descripcion`) VALUES
	(1, 'CONFIRMADA'),
	(2, 'CANCELADA'),
	(3, 'ACEPTADA'),
	(4, 'NO ACEPTADA');
/*!40000 ALTER TABLE `estados_solicitudes` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.franjas_horarias
DROP TABLE IF EXISTS `franjas_horarias`;
CREATE TABLE IF NOT EXISTS `franjas_horarias` (
  `franjas_horarias_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `franja_horaria_desde` varchar(20) DEFAULT NULL,
  `franja_horaria_hasta` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`franjas_horarias_id`),
  UNIQUE KEY `franjas_horarias_idx` (`franja_horaria_desde`,`franja_horaria_hasta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.franjas_horarias: ~0 rows (approximately)
DELETE FROM `franjas_horarias`;
/*!40000 ALTER TABLE `franjas_horarias` DISABLE KEYS */;
/*!40000 ALTER TABLE `franjas_horarias` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.items_orden_compra
DROP TABLE IF EXISTS `items_orden_compra`;
CREATE TABLE IF NOT EXISTS `items_orden_compra` (
  `items_orden_compra_id` int(10) unsigned NOT NULL,
  `items_orden_compra_producto_id` int(10) unsigned NOT NULL,
  `items_orden_compra_cantidad` int(10) unsigned NOT NULL,
  KEY `fk_ioc_orden_compra_idx` (`items_orden_compra_id`),
  KEY `fk_ioc_productos_idx` (`items_orden_compra_producto_id`),
  CONSTRAINT `fk_ioc_orden_compra_idx` FOREIGN KEY (`items_orden_compra_id`) REFERENCES `Grupo-18-OO2-2020_v1`.`0.orden_compra` (`orden_compra_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ioc_productos_idx` FOREIGN KEY (`items_orden_compra_producto_id`) REFERENCES `Grupo-18-OO2-2020_v1`.`0.productos` (`productos_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.items_orden_compra: ~0 rows (approximately)
DELETE FROM `items_orden_compra`;
/*!40000 ALTER TABLE `items_orden_compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `items_orden_compra` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.lote_productos
DROP TABLE IF EXISTS `lote_productos`;
CREATE TABLE IF NOT EXISTS `lote_productos` (
  `lote_productos_productos_id` int(10) unsigned NOT NULL,
  `lote_productos_stock_sucursal_sucursal_id` int(10) unsigned NOT NULL,
  `lote_productos_cantidad` int(10) unsigned NOT NULL,
  `lote_productos_fecha_ingreso` datetime NOT NULL,
  PRIMARY KEY (`lote_productos_productos_id`,`lote_productos_stock_sucursal_sucursal_id`),
  KEY `fk_lp_stock_sucursal_idx` (`lote_productos_stock_sucursal_sucursal_id`),
  CONSTRAINT `fk_lp_productos_idx` FOREIGN KEY (`lote_productos_productos_id`) REFERENCES `productos` (`productos_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_lp_stock_sucursal_idx` FOREIGN KEY (`lote_productos_stock_sucursal_sucursal_id`) REFERENCES `stock_sucursal` (`stock_sucursal_sucursal_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.lote_productos: ~0 rows (approximately)
DELETE FROM `lote_productos`;
/*!40000 ALTER TABLE `lote_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `lote_productos` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.orden_compra
DROP TABLE IF EXISTS `orden_compra`;
CREATE TABLE IF NOT EXISTS `orden_compra` (
  `orden_compra_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `orden_compra_descripcion` varchar(255) DEFAULT NULL,
  `orden_compra_observacion` varchar(255) DEFAULT NULL,
  `orden_compra_cliente_id` int(10) unsigned NOT NULL,
  `orden_compra_fecha_creacion` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `orden_compra_empleado_id` int(10) unsigned NOT NULL,
  `estados_solicitudes_estado` int(10) unsigned NOT NULL,
  `orden_compra_sucursal_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`orden_compra_id`),
  KEY `fk_oc_clientes_idx` (`orden_compra_cliente_id`),
  KEY `fk_oc_empleados_idx` (`orden_compra_empleado_id`),
  KEY `fk_oc_estados_solicitudes_idx` (`estados_solicitudes_estado`),
  KEY `fk_oc_sucursales_idx` (`orden_compra_sucursal_id`),
  CONSTRAINT `fk_oc_clientes_idx` FOREIGN KEY (`orden_compra_cliente_id`) REFERENCES `clientes` (`clientes_persona_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_oc_empleados_idx` FOREIGN KEY (`orden_compra_empleado_id`) REFERENCES `empleados` (`empleados_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_oc_estados_solicitudes_idx` FOREIGN KEY (`estados_solicitudes_estado`) REFERENCES `estados_solicitudes` (`estados_solicitudes_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_oc_sucursales_idx` FOREIGN KEY (`orden_compra_sucursal_id`) REFERENCES `sucursales` (`sucursales_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.orden_compra: ~0 rows (approximately)
DELETE FROM `orden_compra`;
/*!40000 ALTER TABLE `orden_compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `orden_compra` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.pedidos_stock
DROP TABLE IF EXISTS `pedidos_stock`;
CREATE TABLE IF NOT EXISTS `pedidos_stock` (
  `pedidos_stock` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pedidos_stock_orden_compra_id` int(10) unsigned NOT NULL,
  `pedidos_stock_id_sucursal_solicitante` int(10) unsigned NOT NULL,
  `pedidos_stock_id_sucursal_destino` int(10) unsigned NOT NULL,
  `estados_solicitudes_estado_solicitud` int(10) unsigned NOT NULL,
  PRIMARY KEY (`pedidos_stock`),
  KEY `fk_ps_estados_solicitudes` (`estados_solicitudes_estado_solicitud`),
  CONSTRAINT `fk_ps_estados_solicitudes` FOREIGN KEY (`estados_solicitudes_estado_solicitud`) REFERENCES `estados_solicitudes` (`estados_solicitudes_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.pedidos_stock: ~0 rows (approximately)
DELETE FROM `pedidos_stock`;
/*!40000 ALTER TABLE `pedidos_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos_stock` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.personas
DROP TABLE IF EXISTS `personas`;
CREATE TABLE IF NOT EXISTS `personas` (
  `personas_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `personas_nombre` varchar(60) NOT NULL,
  `personas_apellido` varchar(100) NOT NULL,
  `personas_dni` int(10) unsigned NOT NULL,
  `personas_email` varchar(100) DEFAULT NULL,
  `personas_direccion` varchar(150) DEFAULT NULL,
  `personas_telefono` varchar(50) NOT NULL,
  PRIMARY KEY (`personas_id`),
  UNIQUE KEY `personas_dni_UNIQUE` (`personas_dni`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.personas: ~1 rows (approximately)
DELETE FROM `personas`;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` (`personas_id`, `personas_nombre`, `personas_apellido`, `personas_dni`, `personas_email`, `personas_direccion`, `personas_telefono`) VALUES
	(1, 'jUAN', 'PEREZ', 33160288, 'fdg@gmail.com', 'DFDF', '45444552');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.productos
DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `productos_id` int(10) unsigned NOT NULL,
  `producto_codigo` varchar(20) NOT NULL,
  `productos_precio_unitario` decimal(12,0) unsigned NOT NULL,
  `productos_fecha_alta` datetime NOT NULL,
  `productos_marca` varchar(45) DEFAULT NULL,
  `productos_descripcion` varchar(45) DEFAULT NULL,
  `productoscol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`productos_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.productos: ~0 rows (approximately)
DELETE FROM `productos`;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.stock_sucursal
DROP TABLE IF EXISTS `stock_sucursal`;
CREATE TABLE IF NOT EXISTS `stock_sucursal` (
  `stock_sucursal_sucursal_id` int(10) unsigned NOT NULL,
  `stock_sucursal_lote` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`stock_sucursal_sucursal_id`),
  UNIQUE KEY `fk_ss_sucursales_idx` (`stock_sucursal_sucursal_id`,`stock_sucursal_lote`),
  CONSTRAINT `fk_ss_sucursales_idx` FOREIGN KEY (`stock_sucursal_sucursal_id`) REFERENCES `sucursales` (`sucursales_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.stock_sucursal: ~0 rows (approximately)
DELETE FROM `stock_sucursal`;
/*!40000 ALTER TABLE `stock_sucursal` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_sucursal` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.sucursales
DROP TABLE IF EXISTS `sucursales`;
CREATE TABLE IF NOT EXISTS `sucursales` (
  `sucursales_id` int(10) unsigned NOT NULL,
  `sucursales_direccion` varchar(100) DEFAULT NULL,
  `sucursales_latitud` decimal(10,7) DEFAULT NULL,
  `sucursales_longitud` decimal(10,7) DEFAULT NULL,
  `sucursales_email` varchar(100) DEFAULT NULL,
  `sucursales_telefono` varchar(30) DEFAULT NULL,
  `sucursales_empleado_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`sucursales_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.sucursales: ~0 rows (approximately)
DELETE FROM `sucursales`;
/*!40000 ALTER TABLE `sucursales` DISABLE KEYS */;
/*!40000 ALTER TABLE `sucursales` ENABLE KEYS */;

-- Dumping structure for table Grupo-18-OO2-2020_v1.0.tipos_empleados
DROP TABLE IF EXISTS `tipos_empleados`;
CREATE TABLE IF NOT EXISTS `tipos_empleados` (
  `tipo_empleado_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tipo_empleado_descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`tipo_empleado_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table Grupo-18-OO2-2020_v1.0.tipos_empleados: ~3 rows (approximately)
DELETE FROM `tipos_empleados`;
/*!40000 ALTER TABLE `tipos_empleados` DISABLE KEYS */;
INSERT INTO `tipos_empleados` (`tipo_empleado_id`, `tipo_empleado_descripcion`) VALUES
	(1, 'GERENTE'),
	(2, 'VENDEDOR'),
	(3, 'CLIENTE');
/*!40000 ALTER TABLE `tipos_empleados` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
