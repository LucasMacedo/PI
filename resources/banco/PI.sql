CREATE DATABASE `PI`;

USE `PI` ;

CREATE TABLE IF NOT EXISTS `Pessoa` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `endereco` VARCHAR(200) NULL,
  `email` VARCHAR(45) NULL,
  `telefone` VARCHAR(14) NULL,
  `estado` ENUM('Ativo','Inativo') NOT NULL DEFAULT 'Ativo',
  PRIMARY KEY (`codigo`));


CREATE TABLE IF NOT EXISTS `Especialidade` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo`));

CREATE TABLE IF NOT EXISTS `Medico` (
  `codMedico` INT NOT NULL,
  `crm` INT NOT NULL,
  `codEspecialidade` INT NOT NULL,
  PRIMARY KEY (`codMedico`),
  UNIQUE INDEX `crm_UNIQUE` (`crm` ASC),
  CONSTRAINT FOREIGN KEY (`codMedico`) REFERENCES `PI`.`Pessoa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT FOREIGN KEY (`codEspecialidade`) REFERENCES `PI`.`Especialidade` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE IF NOT EXISTS `Paciente` (
  `codPaciente` INT NOT NULL,
  PRIMARY KEY (`codPaciente`),
  CONSTRAINT FOREIGN KEY (`codPaciente`) REFERENCES `PI`.`Pessoa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS `Procedimento` (
  `codProcedimento` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(200) NULL,
  PRIMARY KEY (`codProcedimento`));

CREATE TABLE IF NOT EXISTS `Consulta` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `data` DATE NOT NULL,
  `observacao` VARCHAR(2000) NOT NULL,
  `codMedico` INT NOT NULL,
  `codPaciente` INT NOT NULL,
  `codProcedimento` INT NOT NULL,
  `estado` ENUM('Ativo','Inativo') NOT NULL DEFAULT 'Ativo',
  PRIMARY KEY (`codigo`),
  CONSTRAINT FOREIGN KEY (`codMedico`) REFERENCES `PI`.`Medico` (`codMedico`),
  CONSTRAINT FOREIGN KEY (`codPaciente`) REFERENCES `PI`.`Paciente` (`codPaciente`),
  CONSTRAINT FOREIGN KEY (`codProcedimento`) REFERENCES `Procedimento` (`codProcedimento`));




