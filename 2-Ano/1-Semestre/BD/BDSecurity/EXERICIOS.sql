/*
-- Inserir Departamentos
INSERT INTO departments (name) VALUES 
('Cibersegurança'),
('Desenvolvimento'),
('Recursos Humanos');

-- Inserir Utilizadores
INSERT INTO users (username, email, password_hash, department_id) VALUES 
('alice', 'alice@company.com', 'hash_secure_123', 1),
('bob', 'bob@company.com', 'hash_secure_456', 2),
('charlie', 'charlie@company.com', 'hash_secure_789', 3);

-- Inserir Dispositivos
INSERT INTO devices (hostname, ip_address, os, owner_id) VALUES 
('sec-workstation-01', '192.168.1.50', 'Ubuntu Linux', 1),
('dev-laptop-05', '192.168.1.120', 'Windows 11', 2),
('hr-pc-02', '192.168.1.200', 'Windows 10', 3);
*/

-- A) Consulta simples para listar todos os utilizadores e os respetivos departamentos
SELECT users.username, departments.name 
FROM users
INNER JOIN departments ON users.department_id = departments.id;

-- B) Listar dispositivos e os donos correspondentes
SELECT devices.hostname, devices.ip_address, users.username
FROM devices
LEFT JOIN users ON devices.owner_id = users.id;



SELECT departments.name , users.username, devices.hostname
FROM departments
LEFT JOIN users ON departments.id = users.department_id
LEFT JOIN devices ON users.id = devices.owner_id;
