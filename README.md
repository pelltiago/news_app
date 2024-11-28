# Hacker News App

Una aplicación que muestra las últimas noticias y comentarios de Hacker News con la capacidad de gestionar elementos eliminados y refrescar la lista en tiempo real.

## 📱 Características

- 📰 **Visualización de noticias**: Muestra una lista de historias y comentarios de Hacker News.
- 🧹 **Deslizar para eliminar**: Los usuarios pueden deslizar elementos para eliminarlos de la lista.
- 🔄 **Pull-to-Refresh**: Refresca la lista de noticias arrastrando hacia abajo.
- 🌐 **Navegación web**: Abre enlaces en una vista web integrada al tocar una historia o comentario.
- 🚀 **Almacenamiento persistente**: Guarda elementos eliminados en las preferencias compartidas para que no reaparezcan tras cerrar la aplicación.

## 🛠️ Tecnologías Utilizadas

- **Kotlin**: Lenguaje principal para el desarrollo de la app.
- **Jetpack Compose**: Framework moderno de UI declarativa.
- **ViewModel y LiveData**: Manejo del estado y ciclo de vida.
- **Coroutines**: Para llamadas asíncronas y procesamiento en segundo plano.
- **Material 3**: Diseño moderno basado en Material You.
- **Accompanist SwipeRefresh**: Componente para implementar "Pull-to-Refresh".
- **Retrofit**: Para realizar llamadas a la API de Hacker News.
- **Gson**: Para la deserialización de datos JSON.
- **SharedPreferences**: Para almacenamiento persistente de elementos eliminados.

## 📦 Arquitectura

La aplicación sigue un enfoque basado en MVVM (Model-View-ViewModel) para mantener la separación de responsabilidades:

1. **Model**: Maneja la capa de datos, incluyendo llamadas a la API y almacenamiento local.
2. **ViewModel**: Gestiona el estado de la UI y realiza operaciones de negocio.
3. **View**: Muestra los datos y responde a las interacciones del usuario usando Jetpack Compose.

## 🖼️ Capturas de Pantalla

### Lista de Noticias
<img width="367" alt="Captura de pantalla 2024-11-28 a la(s) 17 40 39" src="https://github.com/user-attachments/assets/95760f3a-f42c-4cf3-8f4e-69a765893472">

### Swipe para Eliminar
https://github.com/user-attachments/assets/e41ce922-768a-4af3-9bf3-9839df05b74a

### Pull to refresh
https://github.com/user-attachments/assets/9c6a95f4-7f2e-4057-96d1-3aff333338d3

### Vista Web
<img width="362" alt="Captura de pantalla 2024-11-28 a la(s) 17 41 52" src="https://github.com/user-attachments/assets/a2bc20aa-9b2f-4bac-83ed-8145708c6420">

