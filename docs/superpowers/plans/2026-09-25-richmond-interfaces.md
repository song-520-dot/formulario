# Interfaces del proyecto Richmond - Plan de implementación

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** Reproducir las siete ventanas visibles en el PDF como formularios Swing editables de NetBeans y usar las imágenes disponibles en `src/img`.

**Architecture:** Un `.java` y un `.form` por ventana. `Login` será el único `JFrame Form`; `Registro`, `Principal`, `NuevoFormulario`, `Resultados`, `GraficoUno` y `GraficoDos` serán `JDialog Form`, conforme a la instrucción del usuario. Los layouts y controles se crearán con componentes Swing estándar; la navegación entre vistas será mínima y las operaciones de datos quedan fuera de alcance.

**Tech Stack:** Java 17, Swing, Apache NetBeans GUI Builder, XML `.form`, imágenes PNG en el classpath.

**Spec:** `docs/superpowers/specs/2026-09-25-richmond-interfaces-design.md`

## Global Constraints

- Las siete pantallas y las dimensiones/capturas especificadas en el PDF son la referencia visual.
- `Login` usa `JFrame Form`; todas las demás ventanas usan `JDialog Form`.
- Reutilizar `src/img/ENCUESTA.png`, `src/img/detallePie.png`, `src/img/encuesta_cabecera.png` y `src/img/encuesta_cabecera_min.png` mediante rutas de classpath.
- No usar capturas completas como fondo ni añadir pantallas o contenido visual ajenos al PDF.
- No implementar persistencia, autenticación, alta real de usuarios, puntuación dinámica, correo SMTP ni consultas de resultados.
- Mantener el proyecto compilable con JDK 17 y sin dependencias externas nuevas.

## Review Focus

- **Bloques protegidos desincronizados:** al abrir cada `.form` debe mostrarse Design sin el error de corrupción; comprobar las siete parejas `.java`/`.form`.
- **Recursos ausentes al ejecutar:** abrir la aplicación desde el classpath y verificar que las cuatro imágenes aparecen y no se ven iconos vacíos.
- **Cambios de tamaño:** comprobar Principal en su mínimo 1060×700 y después de redimensionarlo, sin perder sus dos botones ni cabecera.
- **Cuatro grupos de respuestas independientes:** revisar en Design que cada pregunta tenga su propio `ButtonGroup` con exactamente las opciones del PDF.
- **Propiedad modal de los gráficos:** abrir cada gráfico desde Resultados y comprobar que se presenta encima de su ventana propietaria y bloquea esa ventana hasta cerrarse.

---

### Task 1: Recrear Login según la captura

**Files:**
- Modify: `src/vistas/Login.java`
- Modify: `src/vistas/Login.form`

**Interfaces:**
- Produce: `vistas.Login`, un `JFrame` de 900×500, centrado y sin decoración.
- Produce: botones Entrar, Cerrar y Crear cuenta, con contenido, posición y estilo de la página 1.

- [ ] Reordenar los componentes en el `.form` para que el bloque de login quede a la izquierda y la imagen principal `ENCUESTA.png` a la derecha.
- [ ] Reproducir el fondo negro, bordes y textos rojos, los dos campos y el pie con acciones como aparecen en el PDF.
- [ ] Actualizar las propiedades del diseñador a 900×500, centrado, undecorated y no redimensionable.
- [ ] Abrir `Login.java` en Design y corregir cualquier diferencia entre el `.form` y los bloques generados.
- [ ] Compilar las fuentes del proyecto.

### Task 2: Registro y navegación Login

**Files:**
- Create: `src/vistas/Registro.java`
- Create: `src/vistas/Registro.form`
- Modify: `src/vistas/Login.java`
- Modify: `src/vistas/Login.form`

**Interfaces:**
- Consumes: las imágenes de `src/img`.
- Produce: `vistas.Registro`, un `JDialog` de 700×530 con campos Nombre, Apellidos, Usuario y Contraseña, botón Registrar y botón Volver al Login.

- [ ] Construir el `JDialog Form` con la cabecera ilustrada, fondo negro, panel CREAR CUENTA de borde rojo y controles en el orden/posición de la referencia de la página 1.
- [ ] Hacer que Crear cuenta abra Registro y que Volver al Login cierre Registro y muestre el Login.
- [ ] Mantener el botón Registrar como control visual, sin insertar usuarios ni inventar confirmaciones de datos.
- [ ] Abrir Registro en Design, comprobar la imagen y compilar el proyecto.

### Task 3: Principal y acceso a las vistas

**Files:**
- Create: `src/vistas/Principal.form`
- Modify: `src/vistas/Principal.java`
- Modify: `src/vistas/Login.java`

**Interfaces:**
- Produce: `vistas.Principal`, un `JDialog` redimensionable con tamaño mínimo 1060×700, como lo pide el usuario para el tipo de formulario.
- Produce: botones Nueva Encuesta y Resultados con acceso a sus ventanas.

- [ ] Reproducir cabecera negra, saludo, imagen pequeña de cabecera y cuerpo gris claro de la captura de la página 2.
- [ ] Crear los dos botones grandes centrales con las etiquetas y distribución de la referencia.
- [ ] Conectar Entrar a Principal y los botones a NuevoFormulario y Resultados.
- [ ] Comprobar el tamaño mínimo y el redimensionado; abrir el `.form` en Design y compilar.

### Task 4: Encuesta Richmond

**Files:**
- Modify: `src/vistas/NuevoFormulario.java`
- Create: `src/vistas/NuevoFormulario.form`
- Modify: `src/vistas/Principal.java`

**Interfaces:**
- Produce: `vistas.NuevoFormulario`, un `JDialog` de 1150×650 con cuatro preguntas, grupos de radio independientes, envío, resultado, progreso y opción de correo.

- [ ] Copiar las cuatro preguntas y opciones de la página 9 del PDF sin cambiar el texto; colocar cada pregunta y grupo de opciones como en la página 3.
- [ ] Usar un `ButtonGroup` distinto para cada pregunta y conservar los valores Sí/No, Mucho/Bastante/Algo/Nada y Sí/Probable/Dudoso/No.
- [ ] Añadir botón Enviar, Puntuación obtenida, Nivel de motivación, barra de progreso, casilla Enviar email y campo de correo como controles visuales.
- [ ] Reproducir la cabecera y el panel de la encuesta; no calcular ni enviar datos.
- [ ] Abrir en Design, comprobar los cuatro grupos de radio, y compilar.

### Task 5: Panel de resultados

**Files:**
- Modify: `src/vistas/Resultados.java`
- Create: `src/vistas/Resultados.form`
- Modify: `src/vistas/Principal.java`

**Interfaces:**
- Produce: `vistas.Resultados`, un `JDialog` de 1150×700 con los cinco valores y dos botones de gráficos.

- [ ] Reproducir la cabecera oscura, el panel rojo INFORME DE RESULTADOS, tarjetas negras y botones de la página 5.
- [ ] Mostrar los datos estáticos de la captura: 608 encuestas, Alta 283, Moderada 116, Dudosa 74 y Baja 135.
- [ ] Abrir GraficoUno o GraficoDos como diálogo modal propietario de Resultados.
- [ ] Abrir en Design, cotejar las etiquetas/datos y compilar.

### Task 6: Gráficos de barras y circular

**Files:**
- Create: `src/vistas/GraficoUno.java`
- Create: `src/vistas/GraficoUno.form`
- Create: `src/vistas/GraficoDos.java`
- Create: `src/vistas/GraficoDos.form`
- Create if needed: `src/img/grafico-barras.png`, `src/img/grafico-circular.png`

**Interfaces:**
- Produce: dos `JDialog Form` de 600×500, uno de barras (página 5) y otro circular (página 6), ambos modales sobre Resultados.

- [ ] Reproducir el título, ejes, categorías, valores, leyenda y color de las barras de la página 5.
- [ ] Reproducir título, cuatro sectores, etiquetas y leyenda de la página 6.
- [ ] Usar los valores de la captura y conservar la paleta visible del PDF; si una gráfica se usa como imagen auxiliar, recortar solo el área del gráfico, no la ventana completa.
- [ ] Abrir cada diálogo desde Resultados, comprobar modalidad y cierre, y abrir ambos `.form` en Design.
- [ ] Compilar todo el proyecto.

### Task 7: Revisión de las siete ventanas

**Files:**
- Review: los siete `.java` y siete `.form` de `src/vistas`.
- Review: los recursos de `src/img`.

- [ ] Abrir los siete formularios en NetBeans Design y verificar que ninguno aparece en modo de solo lectura por error de código generado.
- [ ] Ejecutar la aplicación y recorrer Login → Registro/Login y Login → Principal → Nueva Encuesta/Resultados → ambos gráficos.
- [ ] Comparar visualmente cada ventana con su captura del PDF y corregir dimensiones, solapamientos, imágenes y textos.
- [ ] Compilar de nuevo después de los ajustes.
