CREATE TABLE categoria (
                           id SERIAL PRIMARY KEY,
                           nome VARCHAR(100)
);

CREATE TABLE produto (
                         id SERIAL PRIMARY KEY,
                         nome VARCHAR(100),
                         preco NUMERIC,
                         categoria_id INTEGER REFERENCES categoria(id)
);