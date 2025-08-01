# Laboratorio-No.2---Familiarizandome-con-Android-Studio
Laboratorio 2 de Programación para Móviles usando Jetpack Compose. 
Universidad del Valle de Guatemala (UVG)  
Autor: Vernel Josue Hernández Cáceres

## Descripción del proyecto

Este proyecto consiste en una aplicación móvil básica desarrollada en Android Studio utilizando Jetpack Compose como tecnología principal para el diseño de interfaces.  
El objetivo del laboratorio es que el estudiante se familiarice con el entorno de desarrollo de Android Studio, el uso de Jetpack Compose, la ejecución de aplicaciones en un emulador y el uso de GitHub para el control de versiones y la publicación de código.

La aplicación implementada incluye una pantalla inicial sencilla que muestra:
- Un título con el nombre del laboratorio.
- Un mensaje de bienvenida.
- Un botón que, al ser presionado, muestra un mensaje emergente (Toast).

Además, se utilizaron herramientas de control de versiones (Git y GitHub) para almacenar y documentar el código fuente de manera profesional.

## Tecnologías utilizadas

- Lenguaje de programación: Kotlin
- Librería de UI: Jetpack Compose
- Entorno de desarrollo: Android Studio (versión Hedgehog o superior recomendada)
- Sistema de control de versiones: Git
- Plataforma de publicación: GitHub

## Instrucciones para ejecutar la aplicación localmente

1. Clonar este repositorio desde GitHub ejecutando el siguiente comando en la terminal:

   ```bash
   git clone https://github.com/Junjey123-mx/uvg-ppm-lab2-android.git
2. Abrir el proyecto en Android Studio desde la ruta donde fue clonado.

3. Asegurarse de tener configurado un emulador Android o conectar un dispositivo físico en modo desarrollador.

4. Ejecutar la aplicación presionando el botón verde "Run" o utilizando el atajo Shift + F10.

5. Una vez abierta la aplicación, verificar que se visualicen correctamente:

- El título principal.
- El mensaje de bienvenida.
- El botón funcional que, al hacer clic, despliega un mensaje de tipo Toast.

Estructura del proyecto
El archivo principal MainActivity.kt contiene toda la lógica de la interfaz de usuario. La pantalla se compone utilizando un Column que alinea verticalmente los elementos. Se utilizan componentes propios de Jetpack Compose como Text, Spacer, Button y Toast.

Todo el contenido se encuentra dentro del bloque setContent, que permite definir la interfaz de usuario directamente en código Kotlin, eliminando la necesidad del uso de XML tradicional.

Link del video corto explicativo: https://www.canva.com/design/DAGu1AaWeNc/7c1YqULsuNb_QIbdTTNSkQ/watch?utm_content=DAGu1AaWeNc&utm_campaign=designshare&utm_medium=link2&utm_source=uniquelinks&utlId=h38d43f1177
