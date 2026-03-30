# 🎬 Movies API

API REST desarrollada con Spring Boot que consume la API de TMDB para obtener información sobre películas.

🔗 **Repositorio:** [github.com/dannijl88/movies-api](https://github.com/dannijl88/movies-api)

## 🚀 Tecnologías

- Java 25 + Spring Boot 4
- RestTemplate
- TMDB API
- Lombok
- Maven

## ✨ Endpoints

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/api/movies/popular` | Películas populares |
| GET | `/api/movies/top_rated` | Películas mejor valoradas |
| GET | `/api/search/movie/{title}` | Buscar películas por título |
| GET | `/api/movie/{id}` | Detalle de una película |

## ⚙️ Instalación y uso

### Requisitos previos
- Java 25
- Cuenta en [TMDB](https://www.themoviedb.org/) y API key gratuita

### Configuración

Añade tu API key de TMDB en `src/main/resources/application.properties`:

```properties
tmdb.api.key=tu_api_key
tmdb.api.base-url=https://api.themoviedb.org/3
```

### Arrancar el servidor

```bash
./mvnw spring-boot:run
```

El servidor estará disponible en `http://localhost:8080`

## 📝 Ejemplo de respuesta

```json
{
  "page": 1,
  "results": [
    {
      "id": 1241982,
      "title": "Moana 2",
      "overview": "Moana embarks on a new journey...",
      "release_date": "2024-11-27",
      "vote_average": 7.0,
      "poster_path": "/path/to/poster.jpg"
    }
  ],
  "total_pages": 50,
  "total_results": 1000
}
```

## 👨‍💻 Autor

Desarrollado por [@dannijl88](https://github.com/dannijl88)
