CREATE TABLE `person` (
	`id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`name` VARCHAR(255) NOT NULL,
	`address` VARCHAR(255),
	PRIMARY KEY (`id`)
);

CREATE TABLE `house` (
	`id` INT NOT NULL,
	`address` VARCHAR(255),
	PRIMARY KEY (`id`)
);

CREATE TABLE `house_detales` (
	`id` INT NOT NULL,
	`list_of_residents` VARCHAR(255) NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id`)
);

CREATE TABLE `house_to_person` (
	`person_id` INT NOT NULL,
	`house_id` INT NOT NULL
);

ALTER TABLE `house_detales` ADD CONSTRAINT `house_detales_fk0` FOREIGN KEY (`id`) REFERENCES `house`(`id`);

ALTER TABLE `house_to_person` ADD CONSTRAINT `house_to_person_fk0` FOREIGN KEY (`person_id`) REFERENCES `person`(`id`);

ALTER TABLE `house_to_person` ADD CONSTRAINT `house_to_person_fk1` FOREIGN KEY (`house_id`) REFERENCES `house`(`id`);

