INSERT INTO tipo_documento (descripcion) VALUES 
('Cédula de Ciudadanía'),
('Tarjeta de Identidad'),
('Registro Civil');

INSERT INTO grado (descripcion) VALUES
('Primero'),
('Segundo'),
('Tercero'),
('Cuarto'),
('Quinto'),
('Sexto'),
('Séptimo'),
('Octavo'),
('Noveno'),
('Décimo'),
('Once');


INSERT INTO estudiante (id_tipo_documento, numero_identidad, nombres, apellidos, fecha_nacimiento, edad, id_grado, email, telefono_fijo, numero_celular) 
VALUES 
(1, '1012345678', 'Carlos', 'Gómez', '2005-05-14', 18, 11, 'carlos.gomez@mail.com', '6011234567', '3211234567'),
(1, '1034567890', 'Andrés', 'Pérez', '2005-03-12', 18, 11, 'andres.perez@mail.com', '6013456789', '3233456789'),
(1, '1056789012', 'Juan', 'Sánchez', '2005-12-01', 18, 11, 'juan.sanchez@mail.com', '6015678901', '3255678901'),
(2, '1023456789', 'Lucía', 'Martínez', '2006-07-23', 17, 11, 'lucia.martinez@mail.com', '6012345678', '3222345678'),
(2, '1045678901', 'María', 'Rodríguez', '2006-09-30', 17, 11, 'maria.rodriguez@mail.com', '6014567890', '3244567890'),
(2, '1067890123', 'Ana', 'Fernández', '2006-11-25', 17, 11, 'ana.fernandez@mail.com', '6016789012', '3266789012'),
(2, '1078901234', 'David', 'Ramos', '2006-08-20', 17, 11, 'david.ramos@mail.com', '6017890123', '3277890123'),
(2, '1089012345', 'Laura', 'García', '2007-02-15', 17, 11, 'laura.garcia@mail.com', '6018901234', '3288901234'),
(2, '1090123456', 'Santiago', 'López', '2009-04-10', 15, 9, 'santiago.lopez@mail.com', '6019012345', '3299012345'),
(2, '1101234567', 'Camila', 'Torres', '2009-06-08', 15, 9, 'camila.torres@mail.com', '6010123456', '3200123456'),
(2, '1112345678', 'Valentina', 'Guzmán', '2009-08-12', 15, 9, 'valentina.guzman@mail.com', '6011123456', '3201123456'),
(2, '1123456789', 'Mateo', 'Jiménez', '2009-01-23', 15, 9, 'mateo.jimenez@mail.com', '6012234567', '3202234567'),
(2, '1134567890', 'Sebastián', 'Hernández', '2010-05-10', 14, 8, 'sebastian.hernandez@mail.com', '6013345678', '3203345678'),
(3, '1145678901', 'Daniela', 'Luna', '2011-03-04', 13, 7, 'daniela.luna@mail.com', '6014456789', '3204456789'),
(3, '1156789012', 'Isabella', 'Morales', '2012-11-12', 12, 6, 'isabella.morales@mail.com', '6015567890', '3205567890'),
(3, '1167890123', 'Sofía', 'Ortega', '2011-07-29', 13, 7, 'sofia.ortega@mail.com', '6016678901', '3206678901'),
(2, '1178901234', 'Samuel', 'Ruiz', '2008-11-14', 16, 10, 'samuel.ruiz@mail.com', '6017789012', '3207789012'),
(2, '1189012345', 'Sara', 'Mendoza', '2008-04-20', 16, 10, 'sara.mendoza@mail.com', '6018890123', '3208890123'),
(2, '1190123456', 'Tomás', 'Vargas', '2007-06-18', 16, 10, 'tomas.vargas@mail.com', '6019901234', '3209901234'),
(2, '1201234567', 'Martín', 'Castro', '2007-01-30', 16, 10, 'martin.castro@mail.com', '6010012345', '3200012345'),
(3, '1212345678', 'Emilio', 'Nieto', '2012-10-14', 11, 5, 'emilio.nieto@mail.com', '6011122334', '3201234567'),
(3, '1223456789', 'Alejandra', 'Suárez', '2013-01-05', 11, 5, 'alejandra.suarez@mail.com', '6012233445', '3202345678'),
(3, '1234567890', 'Fernando', 'Palacios', '2011-12-18', 12, 6, 'fernando.palacios@mail.com', '6013344556', '3203456789'),
(3, '1245678901', 'Gabriela', 'Castaño', '2012-09-22', 11, 5, 'gabriela.castano@mail.com', '6014455667', '3204567890'),
(3, '1256789012', 'Jorge', 'Maldonado', '2011-08-14', 12, 6, 'jorge.maldonado@mail.com', '6015566778', '3205678901'),
(2, '1267890123', 'Paola', 'Espinosa', '2010-04-30', 13, 7, 'paola.espinosa@mail.com', '6016677889', '3206789012'),
(2, '1278901234', 'Héctor', 'Ramírez', '2010-11-25', 13, 7, 'hector.ramirez@mail.com', '6017788990', '3207890123'),
(3, '1289012345', 'Diana', 'Ortiz', '2012-06-15', 11, 5, 'diana.ortiz@mail.com', '6018899001', '3208901234'),
(3, '1290123456', 'Fabián', 'Ríos', '2011-03-10', 12, 6, 'fabian.rios@mail.com', '6019900112', '3209012345'),
(3, '1301234567', 'Elena', 'Rojas', '2011-05-20', 12, 6, 'elena.rojas@mail.com', '6010011223', '3200123456');


-- Escriba un SQL que permita obtener información de los estudiantes que pertenezcan al último grado (Grado 11).
SELECT nombres, apellidos
FROM estudiante
WHERE id_grado = 11;

-- Escriba un SQL que permita obtener información de los estudiantes que tengan la edad de 15 a 17 años.
SELECT nombres, apellidos
FROM estudiante
WHERE edad BETWEEN 15 AND 17;

