# DSMovie 🎬

![GitHub repo size](https://img.shields.io/github/repo-size/lucasrochadnsx/dsmovie)
![GitHub language count](https://img.shields.io/github/languages/count/lucasrochadnsx/dsmovie)
![License](https://img.shields.io/github/license/lucasrochadnsx/dsmovie)

DSMovie é um projeto full stack para **visualização e avaliação de filmes**, com backend em **Spring Boot** e frontend em **React.js**.

---

## 🎥 Demonstração

![DSMovie Demo](https://media.giphy.com/media/3o6fJbn4p9HxazLz0o/giphy.gif)
*A interface mostra os filmes, permite avaliações e paginação.*

* Backend online: [Render](https://dsmovie-m5fc.onrender.com)
* Frontend online: [Netlify](https://zingy-mousse-aa9301.netlify.app/)

---

## 💻 Tecnologias

**Backend:**

* Java 17 + Spring Boot 3
* Spring Data JPA
* Spring Security (JWT)
* PostgreSQL

**Frontend:**

* React.js + TypeScript
* Axios
* React Router
* Bootstrap / CSS

**Deploy:**

* Render (Backend)
* Netlify (Frontend)

---

## ⚙️ Rodando Localmente

### Backend

```bash
git clone https://github.com/lucasrochadnsx/dsmovie.git
cd dsmovie/backend
```

1. Configure `application.properties` ou variáveis de ambiente:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/usermanagement
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

2. Rode o backend:

```bash
./mvnw spring-boot:run
```

3. API disponível em `http://localhost:8080`

### Frontend

```bash
cd dsmovie/frontend
```

1. Crie `.env`:

```env
REACT_APP_API_URL=http://localhost:8080
```

2. Instale dependências:

```bash
npm install
```

3. Rode o frontend:

```bash
npm start
```

4. Abra `http://localhost:3000` no navegador

---

## 📦 Estrutura do Projeto

```
DSMovie/
│
├─ backend/          # Spring Boot + PostgreSQL
│
├─ frontend/         # React + TypeScript
│
└─ README.md
```

---

## 🔑 Funcionalidades

* Listagem de filmes com paginação
* Consulta detalhada de filmes
* Avaliação por usuário
* Interface responsiva

---

## ⚠️ Observações

* Configure **CORS** no backend para permitir chamadas do frontend.
* Use `.env` no frontend para configurar a URL da API.

---

## 📄 Licença

MIT License

---

## 👨‍💻 Autor

Lucas Rocha
[LinkedIn](https://www.linkedin.com/in/lucasrochadnsx) | [GitHub](https://github.com/lucasrochadnsx)
