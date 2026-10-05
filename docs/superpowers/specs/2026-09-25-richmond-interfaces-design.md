# Diseño de las interfaces del proyecto Encuesta Richmond

## Objetivo

Recrear en Swing las siete interfaces que aparecen en `C:\Users\song\Downloads\Proyecto encuestas.pdf`, con sus dimensiones, textos, controles, distribución, colores e imágenes de referencia. El usuario ha precisado que el Login debe ser un `JFrame Form` y todas las demás ventanas `JDialog Form`. Las capturas del PDF son la referencia visual; no se diseñarán pantallas adicionales.

## Alcance

- Rediseñar el Login existente para ajustarlo a la captura de la página 1.
- Crear las vistas Registro, Principal, NuevoFormulario, Resultados, GraficoUno y GraficoDos, todas como `JDialog Form` editables por NetBeans.
- Usar componentes Swing reales en cada formulario. No poner la captura completa como fondo ni ocultar controles detrás de una imagen.
- Reutilizar las imágenes que el usuario añadió a `src/img`: `ENCUESTA.png` (700×350) para la fotografía principal; `detallePie.png` (701×157) como imagen horizontal; `encuesta_cabecera.png` (120×120) y `encuesta_cabecera_min.png` (75×75) para las cabeceras/iconos de las ventanas. Cargar las imágenes desde el classpath.
- Implementar únicamente la navegación mínima entre pantallas para que se puedan abrir y revisar.
- No implementar persistencia, autenticación, alta de usuarios, puntuación, correo SMTP ni datos dinámicos. Las cifras de la pantalla de resultados serán las que aparecen en la referencia, presentadas como contenido visual estático.

## Referencias visuales y requisitos

1. **Login (`vistas.Login`, `JFrame Form`)** — Página 1. Tamaño 900×500, centrado y sin decoración. Fondo negro. Panel de acceso a la izquierda con borde rojo, campos Usuario y Contraseña y botón Entrar. Fotografía a la derecha. Pie con Cerrar, texto de registro y botón Crear cuenta.
2. **Registro (`vistas.Registro`, `JDialog Form`)** — Página 1. Tamaño 700×530. Cabecera con imagen, fondo negro y grupo CREAR CUENTA delimitado en rojo. Campos Nombre, Apellidos, Usuario y Contraseña; botones Registrar y Volver al Login.
3. **Principal (`vistas.Principal`, `JDialog Form`)** — Página 2. Tamaño mínimo 1060×700, redimensionable. Cabecera negra con Bienvenido admin e imagen/logotipo; área de contenido gris claro y dos accesos principales: Nueva Encuesta y Resultados. La petición explícita de usar `JDialog Form` prevalece sobre la etiqueta `JFrame` de la captura; se conserva el tamaño mínimo y se permite redimensionar.
4. **Nueva encuesta (`vistas.NuevoFormulario`, `JDialog Form`)** — Página 3. Tamaño 1150×650. Cabecera oscura; bloque CUESTIONARIO RICHMOND; cuatro preguntas y sus opciones de radio; botón Enviar; Puntuación obtenida; Nivel de motivación; barra de progreso; casilla Enviar email y campo de correo. Se replica la distribución de la captura y el contenido textual de la página 9.
5. **Resultados (`vistas.Resultados`, `JDialog Form`)** — Página 5. Tamaño 1150×700. Cabecera oscura y panel rojo INFORME DE RESULTADOS. Cinco categorías y cifras visibles en la imagen: Nº de encuestas 608, Alta 283, Moderada 116, Dudosa 74 y Baja 135. Acciones Ver gráfico de barras y Ver gráfico circular.
6. **Gráfico de barras (`vistas.GraficoUno`, `JDialog Form`)** — Página 5. Tamaño 600×500. Título Puntuación, categorías Alta, Moderada, Dudosa y Baja, barras con los valores del informe y leyenda Nivel de motivación.
7. **Gráfico circular (`vistas.GraficoDos`, `JDialog Form`)** — Página 6. Tamaño 600×500. Título NIVEL DE MOTIVACIÓN, sectores y etiquetas Motivación alta, moderada, dudosa y baja, con leyenda inferior. Se abre como ventana modal desde Resultados.

## Diseño técnico

- Mantener las clases en el paquete `vistas` y crear un `.java` y un `.form` por ventana, con bloques protegidos generados por el GUI Builder de NetBeans.
- Mantener los recursos en el paquete `img`; referenciarlos desde Swing mediante el classpath, sin rutas absolutas del equipo.
- Usar layouts Swing compatibles con el GUI Builder. Las áreas que deban conservar proporción o responder al redimensionado usarán contenedores y layouts, no coordenadas absolutas.
- Usar `ButtonGroup` para las opciones de cada pregunta y mantener los grupos separados.
- `Principal` conserva tamaño mínimo 1060×700 y permite redimensionado. Los otros tamaños de referencia se establecen como tamaño preferido de cada formulario.
- La navegación solo abre y cierra las ventanas correspondientes. Los botones que representan persistencia, cálculo, envío de correo o resultados dinámicos quedan sin esa lógica.

## Verificación

- Compilar todas las fuentes con el JDK configurado.
- Validar que cada `.form` parsea y corresponde a su clase Java.
- Abrir cada formulario en la vista Design de NetBeans para comprobar que no aparece el error de bloques protegidos.
- Ejecutar cada ventana y comparar visualmente su tamaño, controles, distribución e imágenes con su captura del PDF.

## Exclusiones

No incluir lógica ni credenciales de la base de datos o del servidor SMTP descritos en el PDF. No implementar otras pantallas, personalizaciones ni texto que no figure en el documento.
