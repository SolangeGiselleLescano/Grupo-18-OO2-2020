-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bd-sistema
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bd-sistema
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd-sistema` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `bd-sistema` ;

-- -----------------------------------------------------
-- Table `bd-sistema`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`persona` (
  `idPersona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  `apellido` VARCHAR(20) NOT NULL,
  `fechaNacimiento` DATE NOT NULL,
  PRIMARY KEY (`idPersona`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bd-sistema`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`cliente` (
  `idCliente` INT NOT NULL,
  `mail` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`idCliente`),
  CONSTRAINT `fk_cliente`
    FOREIGN KEY (`idCliente`)
    REFERENCES `bd-sistema`.`persona` (`idPersona`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bd-sistema`.`direccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`direccion` (
  `idDireccion` INT NOT NULL,
  `ciudad` VARCHAR(20) NOT NULL,
  `calle` VARCHAR(20) NOT NULL,
  `altura` INT NOT NULL,
  `latitud` DOUBLE NOT NULL,
  `longitud` DOUBLE NOT NULL,
  PRIMARY KEY (`idDireccion`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd-sistema`.`empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`empleado` (
  `idEmpleado` INT NOT NULL,
  `horasPorJornada` INT NOT NULL,
  `sueldoBasico` FLOAT NOT NULL,
  PRIMARY KEY (`idEmpleado`),
  CONSTRAINT `fk_empleado`
    FOREIGN KEY (`idEmpleado`)
    REFERENCES `bd-sistema`.`persona` (`idPersona`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bd-sistema`.`sucursal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`sucursal` (
  `idSucursal` INT NOT NULL,
  `telefono` INT NULL DEFAULT NULL,
  `idDireccion` INT NOT NULL,
  PRIMARY KEY (`idSucursal`, `idDireccion`),
  INDEX `fk_sucursal_direccion1_idx` (`idDireccion` ASC) VISIBLE,
  CONSTRAINT `fk_sucursal_direccion1`
    FOREIGN KEY (`idDireccion`)
    REFERENCES `bd-sistema`.`direccion` (`idDireccion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd-sistema`.`gerente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`gerente` (
  `idGerente` INT NOT NULL,
  `idSucursal` INT NOT NULL,
  PRIMARY KEY (`idGerente`),
  INDEX `fk_gerente_sucursal1_idx` (`idSucursal` ASC) VISIBLE,
  CONSTRAINT `fk_gerente_empleado1`
    FOREIGN KEY (`idGerente`)
    REFERENCES `bd-sistema`.`empleado` (`idEmpleado`),
  CONSTRAINT `fk_gerente_sucursal1`
    FOREIGN KEY (`idSucursal`)
    REFERENCES `bd-sistema`.`sucursal` (`idSucursal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd-sistema`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`producto` (
  `idProducto` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `precioUnitario` FLOAT NOT NULL,
  `fechaAlta` DATE NOT NULL,
  PRIMARY KEY (`idProducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd-sistema`.`lote`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`lote` (
  `idLote` INT NOT NULL,
  `cantidadProducto` INT NOT NULL,
  `cantidadActual` INT NOT NULL,
  `fechaDeIngreso` DATE NOT NULL,
  `idSucursal` INT NOT NULL,
  `idProducto` INT NOT NULL,
  PRIMARY KEY (`idLote`, `idSucursal`, `idProducto`),
  INDEX `fk_lote_sucursal1_idx` (`idSucursal` ASC) VISIBLE,
  INDEX `fk_lote_producto1_idx` (`idProducto` ASC) VISIBLE,
  CONSTRAINT `fk_lote_producto1`
    FOREIGN KEY (`idProducto`)
    REFERENCES `bd-sistema`.`producto` (`idProducto`),
  CONSTRAINT `fk_lote_sucursal1`
    FOREIGN KEY (`idSucursal`)
    REFERENCES `bd-sistema`.`sucursal` (`idSucursal`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd-sistema`.`vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`vendedor` (
  `idVendedor` INT NOT NULL,
  `plus` FLOAT NOT NULL,
  `idSucursal` INT NOT NULL,
  PRIMARY KEY (`idVendedor`),
  INDEX `fk_vendedor_sucursal1_idx` (`idSucursal` ASC) VISIBLE,
  CONSTRAINT `fk_vendedor_empleado1`
    FOREIGN KEY (`idVendedor`)
    REFERENCES `bd-sistema`.`empleado` (`idEmpleado`),
  CONSTRAINT `fk_vendedor_sucursal1`
    FOREIGN KEY (`idSucursal`)
    REFERENCES `bd-sistema`.`sucursal` (`idSucursal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd-sistema`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`venta` (
  `idVenta` INT NOT NULL,
  `numero` INT NOT NULL,
  `fecha` DATE NOT NULL,
  `hora` DATETIME NOT NULL,
  `precioTotal` FLOAT NOT NULL,
  `idCliente` INT NOT NULL,
  `idSucursal` INT NOT NULL,
  `idVendedor` INT NOT NULL,
  PRIMARY KEY (`idVenta`, `idSucursal`, `idVendedor`),
  INDEX `fk_venta_cliente1_idx` (`idCliente` ASC) VISIBLE,
  INDEX `fk_venta_sucursal1_idx` (`idSucursal` ASC) VISIBLE,
  INDEX `fk_venta_vendedor1_idx` (`idVendedor` ASC) VISIBLE,
  CONSTRAINT `fk_venta_cliente1`
    FOREIGN KEY (`idCliente`)
    REFERENCES `bd-sistema`.`cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_sucursal1`
    FOREIGN KEY (`idSucursal`)
    REFERENCES `bd-sistema`.`sucursal` (`idSucursal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_vendedor1`
    FOREIGN KEY (`idVendedor`)
    REFERENCES `bd-sistema`.`vendedor` (`idVendedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd-sistema`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-sistema`.`pedido` (
  `idPedido` INT NOT NULL,
  `cantidad` INT NOT NULL,
  `idProducto` INT NOT NULL,
  `idVenta` INT NOT NULL,
  `idVendedorAuxiliar` INT NOT NULL,
  PRIMARY KEY (`idPedido`, `idProducto`),
  INDEX `fk_pedido_producto1_idx` (`idProducto` ASC) VISIBLE,
  INDEX `fk_pedido_venta1_idx` (`idVenta` ASC) VISIBLE,
  INDEX `fk_pedido_vendedor1_idx` (`idVendedorAuxiliar` ASC) VISIBLE,
  CONSTRAINT `fk_pedido_producto1`
    FOREIGN KEY (`idProducto`)
    REFERENCES `bd-sistema`.`producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedido_venta1`
    FOREIGN KEY (`idVenta`)
    REFERENCES `bd-sistema`.`venta` (`idVenta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedido_vendedor1`
    FOREIGN KEY (`idVendedorAuxiliar`)
    REFERENCES `bd-sistema`.`vendedor` (`idVendedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
