CREATE TABLE authors (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(75) NOT NULL UNIQUE
);

CREATE TABLE categories (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE,
);

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(25) NOT NULL,
    email VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(25) NOT NULL,
    birthday timestamp NOT NULL
);

CREATE TABLE books (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(128) NOT NULL UNIQUE,
    author_id BIGINT NOT NULL,
    format VARCHAR(36) NOT NULL,
    rating FLOAT,
    price FLOAT,
    currency VARCHAR(5)
);

-- foreign key author_id in table books --
ALTER TABLE books
ADD CONSTRAINT fk_author_id
FOREIGN KEY (author_id) REFERENCES authors(id)
ON DELETE CASCADE
ON UPDATE CASCADE;

-- Junction Table Books - Categories --
CREATE TABLE book_category (
    book_id BIGINT NOT NULL,
    category_id BIGINT NOT NULL,
    PRIMARY KEY (book_id, category_id)
    FOREIGN KEY (book_id) REFERENCES books(id) ON DELETE CASCADE
    FOREIGN KEY (category_id) REFERENCES categories(id) ON DELETE CASCADE
);


