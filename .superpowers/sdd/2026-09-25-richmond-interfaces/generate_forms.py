from pathlib import Path
import xml.etree.ElementTree as ET

ROOT = Path.cwd()
SRC = ROOT / "src" / "vistas"
NL = "http://www.netbeans.org/ns/project/1"
ABS = "org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout"


def c(name, typ, x, y, w, h, **kw):
    return {"name": name, "typ": typ, "x": x, "y": y, "w": w, "h": h, **kw}


def rgb(hex_color):
    return tuple(int(hex_color[i:i+2], 16) for i in (1, 3, 5))


def color_xml(parent, name, value):
    p = ET.SubElement(parent, "Property", {"name": name, "type": "java.awt.Color", "editor": "org.netbeans.beaninfo.editors.ColorEditor"})
    r, g, b = rgb(value)
    ET.SubElement(p, "Color", {"blue": f"{b:02x}", "green": f"{g:02x}", "red": f"{r:02x}", "type": "rgb"})


def dim_xml(parent, name, width, height):
    p = ET.SubElement(parent, "Property", {"name": name, "type": "java.awt.Dimension", "editor": "org.netbeans.beaninfo.editors.DimensionEditor"})
    ET.SubElement(p, "Dimension", {"value": f"[{width}, {height}]"})


def border_xml(parent, value):
    p = ET.SubElement(parent, "Property", {"name": "border", "type": "javax.swing.border.Border", "editor": "org.netbeans.modules.form.editors2.BorderEditor"})
    b = ET.SubElement(p, "Border", {"info": "org.netbeans.modules.form.compat2.border.LineBorderInfo"})
    line = ET.SubElement(b, "LineBorder")
    r, g, blue = rgb(value)
    ET.SubElement(line, "Color", {"PropertyName": "color", "blue": f"{blue:02x}", "green": f"{g:02x}", "red": f"{r:02x}", "type": "rgb"})


def xml_properties(node, spec):
    props = ET.SubElement(node, "Properties")
    if "text" in spec:
        ET.SubElement(props, "Property", {"name": "text", "type": "java.lang.String", "value": spec["text"]})
    if "bg" in spec:
        color_xml(props, "background", spec["bg"])
    if "fg" in spec:
        color_xml(props, "foreground", spec["fg"])
    if "font" in spec:
        p = ET.SubElement(props, "Property", {"name": "font", "type": "java.awt.Font", "editor": "org.netbeans.beaninfo.editors.FontEditor"})
        ET.SubElement(p, "Font", {"name": "Tahoma", "size": str(spec["font"]), "style": "1" if spec.get("bold") else "0"})
    if "icon" in spec:
        p = ET.SubElement(props, "Property", {"name": "icon", "type": "javax.swing.Icon", "editor": "org.netbeans.modules.form.editors2.IconEditor"})
        ET.SubElement(p, "Image", {"iconType": "3", "name": "/img/" + spec["icon"]})
    for name in ("opaque", "enabled", "editable", "focusPainted", "borderPainted", "contentAreaFilled"):
        if name in spec:
            ET.SubElement(props, "Property", {"name": name, "type": "boolean", "value": str(spec[name]).lower()})
    for name in ("horizontalAlignment", "verticalAlignment", "maximum", "minimum", "value"):
        if name in spec:
            ET.SubElement(props, "Property", {"name": name, "type": "int", "value": str(spec[name])})
    if "tooltip" in spec:
        ET.SubElement(props, "Property", {"name": "toolTipText", "type": "java.lang.String", "value": spec["tooltip"]})
    if "border" in spec:
        border_xml(props, spec["border"])
    if "align" in spec:
        ET.SubElement(props, "Property", {"name": "horizontalAlignment", "type": "int", "value": str(spec["align"])})
    if "group" in spec:
        p = ET.SubElement(props, "Property", {"name": "buttonGroup", "type": "javax.swing.ButtonGroup", "editor": "org.netbeans.modules.form.RADComponent$ButtonGroupPropertyEditor"})
        ET.SubElement(p, "ComponentRef", {"name": spec["group"]})


screens = {}


screens["Login"] = {
    "kind": "frame", "width": 900, "height": 500, "title": "", "close": 3,
    "resizable": False, "undecorated": True, "bg": "#000000", "center": True,
    "groups": [],
    "components": [
        c("bordeLogin", "JPanel", 46, 91, 267, 253, border="#cc0000", opaque=False),
        c("tituloLogin", "JLabel", 53, 82, 120, 24, text="LOGIN", fg="#e00000", font=16),
        c("etiquetaUsuario", "JLabel", 112, 160, 140, 20, text="Usuario", fg="#ef0000", font=12),
        c("campoUsuario", "JTextField", 111, 181, 143, 20),
        c("etiquetaContrasena", "JLabel", 112, 218, 140, 20, text="Contraseña", fg="#ef0000", font=12),
        c("campoContrasena", "JPasswordField", 111, 239, 143, 20),
        c("botonEntrar", "JButton", 111, 289, 144, 25, text="Entrar", bg="#d70000", fg="#ffffff", font=12, focusPainted=False, event="abrirPrincipal"),
        c("imagenEncuesta", "JLabel", 333, 43, 522, 350, icon="ENCUESTA.png"),
        c("botonCerrar", "JButton", 20, 452, 72, 26, text="cerrar", bg="#d70000", fg="#ffffff", font=12, focusPainted=False, event="cerrarAplicacion"),
        c("textoRegistro", "JLabel", 502, 435, 205, 28, text="Registrese si no tiene cuenta", fg="#e00000", font=11),
        c("botonCrearCuenta", "JButton", 717, 431, 116, 28, text="Crear cuenta", bg="#d70000", fg="#ffffff", font=12, focusPainted=False, event="abrirRegistro"),
    ],
}

screens["Registro"] = {
    "kind": "dialog", "width": 700, "height": 530, "title": "REGISTRO", "close": 2,
    "resizable": False, "undecorated": False, "bg": "#000000", "center": True,
    "groups": [],
    "components": [
        c("imagenCabecera", "JLabel", 0, 0, 700, 70, icon="detallePie.png"),
        c("bordeRegistro", "JPanel", 128, 140, 448, 320, border="#cc0000", opaque=False),
        c("tituloRegistro", "JLabel", 136, 134, 150, 22, text="CREAR CUENTA", fg="#e00000", font=11),
        c("etiquetaNombre", "JLabel", 168, 166, 130, 22, text="Nombre", fg="#e00000", font=12),
        c("campoNombre", "JTextField", 337, 166, 185, 20),
        c("etiquetaApellidos", "JLabel", 168, 202, 130, 22, text="Apellidos", fg="#e00000", font=12),
        c("campoApellidos", "JTextField", 337, 202, 185, 20),
        c("separadorRegistro", "JSeparator", 188, 247, 335, 2),
        c("etiquetaUsuario", "JLabel", 198, 268, 100, 22, text="Usuario", fg="#e00000", font=12),
        c("campoUsuario", "JTextField", 311, 268, 168, 20),
        c("etiquetaContrasena", "JLabel", 198, 314, 100, 22, text="Contraseña", fg="#e00000", font=12),
        c("campoContrasena", "JPasswordField", 311, 314, 168, 20),
        c("botonRegistrar", "JButton", 311, 354, 123, 28, text="Registrar", bg="#d70000", fg="#ffffff", font=12, focusPainted=False),
        c("botonVolverLogin", "JButton", 275, 405, 230, 28, text="Volver al Login", bg="#d70000", fg="#ffffff", font=12, focusPainted=False, event="volverLogin"),
    ],
}

screens["Principal"] = {
    "kind": "dialog", "width": 1060, "height": 700, "minWidth": 1060, "minHeight": 700,
    "title": "", "close": 2, "resizable": True, "undecorated": False, "bg": "#eeeeee", "center": True,
    "groups": [],
    "components": [
        c("barraSuperior", "JPanel", 0, 0, 1060, 140, bg="#000000"),
        c("contenidoPrincipal", "JPanel", 0, 140, 1060, 520, bg="#eeeeee"),
        c("barraInferior", "JPanel", 0, 660, 1060, 40, bg="#000000"),
        c("bienvenida", "JLabel", 25, 53, 430, 40, text="Bienvenido admin", fg="#e00000", font=14),
        c("imagenLogo", "JLabel", 888, 17, 120, 120, icon="encuesta_cabecera.png"),
        c("botonNuevaEncuesta", "JButton", 277, 309, 200, 100, text="Nueva Encuesta", bg="#000000", fg="#e00000", font=12, focusPainted=False, event="abrirEncuesta"),
        c("botonResultados", "JButton", 578, 309, 200, 100, text="Resultados", bg="#000000", fg="#e00000", font=12, focusPainted=False, event="abrirResultados"),
    ],
}

questions = [
    ("pregunta1", "¿Le gustaría dejar de fumar si pudiera hacerlo fácilmente?", 166, [("r1Si", "Sí", 620), ("r1No", "No", 713)], "grupoPregunta1"),
    ("pregunta2", "¿Cuánto interés tiene en dejarlo?", 236, [("r2Mucho", "MUCHO", 620), ("r2Bastante", "BASTANTE", 704), ("r2Algo", "ALGO", 808), ("r2Nada", "NADA", 884)], "grupoPregunta2"),
    ("pregunta3", "¿Intentará dejar de fumar en las próximas dos semanas?", 306, [("r3Mucho", "MUCHO", 620), ("r3Bastante", "BASTANTE", 704), ("r3Algo", "ALGO", 808), ("r3Nada", "NADA", 884)], "grupoPregunta3"),
    ("pregunta4", "¿Cree que dentro de 6 meses no fumará?", 376, [("r4Si", "SI", 620), ("r4Probable", "PROBABLE", 690), ("r4Dudoso", "DUDOSO", 800), ("r4No", "NO", 890)], "grupoPregunta4"),
]
survey_components = [
    c("barraEncuesta", "JPanel", 0, 0, 1150, 97, bg="#000000"),
    c("tituloEncuesta", "JLabel", 40, 18, 840, 28, text="TEST DE MOTIVACIÓN PARA DEJAR DE FUMAR – RICHMOND", fg="#ffffff", font=18),
    c("encuestador", "JLabel", 40, 53, 400, 22, text="Encuestador: admin", fg="#ffffff", font=12),
    c("logoEncuesta", "JLabel", 1060, 7, 75, 75, icon="encuesta_cabecera_min.png"),
    c("bordeCuestionario", "JPanel", 90, 117, 972, 510, border="#9bb4d2", opaque=False),
]
for name, question, y, options, group in questions:
    survey_components.append(c(name, "JLabel", 175, y, 430, 26, text=question, fg="#d00000", font=14))
    sep_y = y + 33
    survey_components.append(c("separador" + name[-1], "JSeparator", 175, sep_y, 775, 2))
    for radio_name, text, x in options:
        survey_components.append(c(radio_name, "JRadioButton", x, y, 90 if len(text) > 5 else 65, 26,
                                   text=text, fg="#d00000", font=11, group=group))
survey_components += [
    c("botonEnviar", "JButton", 405, 435, 325, 35, text="ENVIAR", bg="#000000", fg="#e00000", font=12, focusPainted=False),
    c("textoPuntuacion", "JLabel", 247, 493, 135, 25, text="Puntuación obtenida", fg="#000000", font=10),
    c("campoPuntuacion", "JTextField", 382, 491, 52, 29, editable=False, align=0),
    c("textoNivel", "JLabel", 540, 493, 160, 25, text="Nivel de motivación", fg="#000000", font=10),
    c("barraProgreso", "JProgressBar", 713, 486, 202, 30, minimum=0, maximum=10, value=0),
    c("checkEnviarEmail", "JCheckBox", 294, 550, 130, 26, text="¿Enviar email?", fg="#000000", font=10, event="alternarCorreo"),
    c("campoEmail", "JTextField", 432, 550, 283, 26, enabled=False),
    c("botonEnviarEmail", "JButton", 762, 547, 70, 28, text="Enviar", enabled=False),
]
screens["NuevoFormulario"] = {
    "kind": "dialog", "width": 1150, "height": 650, "title": "", "close": 2,
    "resizable": False, "undecorated": False, "bg": "#eeeeee", "center": True,
    "groups": [g[-1] for g in questions], "components": survey_components,
}

result_components = [
    c("barraResultados", "JPanel", 0, 0, 1150, 47, bg="#000000"),
    c("logoResultados", "JLabel", 1074, 0, 75, 75, icon="encuesta_cabecera_min.png"),
    c("panelInforme", "JPanel", 38, 100, 1074, 560, bg="#a90000"),
    c("tituloInforme", "JLabel", 96, 126, 480, 32, text="INFORME DE RESULTADOS", fg="#ffffff", font=18),
]
metrics = [("Encuestas", "Nº de encuestas", "608"), ("Alta", "Alta", "283"), ("Moderada", "Moderada", "116"), ("Dudosa", "Dudosa", "74"), ("Baja", "Baja", "135")]
for i, (key, label, value) in enumerate(metrics):
    x = 87 + i * 200
    result_components.append(c("categoria" + key, "JLabel", x, 220, 160, 40, text=label, bg="#000000", fg="#ffffff", font=14, opaque=True, align=0))
    result_components.append(c("valor" + key, "JLabel", x, 299, 160, 76, text=value, bg="#000000", fg="#ffffff", font=30, opaque=True, align=0))
result_components += [
    c("fondoBotonesGraficos", "JPanel", 288, 353, 550, 84, bg="#000000"),
    c("botonGraficoBarras", "JButton", 338, 382, 180, 30, text="VER GRÁFICO DE BARRAS", bg="#d50000", fg="#ffffff", font=10, focusPainted=False, event="abrirGraficoBarras"),
    c("botonGraficoCircular", "JButton", 618, 382, 170, 30, text="VER GRÁFICO CIRCULAR", bg="#d50000", fg="#ffffff", font=10, focusPainted=False, event="abrirGraficoCircular"),
]
screens["Resultados"] = {
    "kind": "dialog", "width": 1150, "height": 700, "title": "RESULTADOS", "close": 2,
    "resizable": False, "undecorated": False, "bg": "#eeeeee", "center": True,
    "groups": [], "components": result_components,
}

for cls, title, icon in [("GraficoUno", "GRÁFICO", "grafico-barras.png"), ("GraficoDos", "GRÁFICO", "grafico-circular.png")]:
    screens[cls] = {
        "kind": "dialog", "width": 600, "height": 500, "title": title, "close": 2,
        "resizable": False, "undecorated": False, "bg": "#ffffff", "center": True,
        "groups": [], "components": [
            c("grafico", "JLabel", 0, 0, 600, 466, icon=icon, align=0),
        ],
    }


TYPE_TO_JAVA = {
    "JFrame": "javax.swing.JFrame", "JDialog": "javax.swing.JDialog",
    "JPanel": "javax.swing.JPanel", "JLabel": "javax.swing.JLabel",
    "JButton": "javax.swing.JButton", "JTextField": "javax.swing.JTextField",
    "JPasswordField": "javax.swing.JPasswordField", "JSeparator": "javax.swing.JSeparator",
    "JRadioButton": "javax.swing.JRadioButton", "JProgressBar": "javax.swing.JProgressBar",
    "JCheckBox": "javax.swing.JCheckBox",
}


def form_xml(class_name, spec):
    form_type = "org.netbeans.modules.form.forminfo.JFrameFormInfo" if spec["kind"] == "frame" else "org.netbeans.modules.form.forminfo.JDialogFormInfo"
    root = ET.Element("Form", {"version": "1.3", "maxVersion": "1.9", "type": form_type})
    props = ET.SubElement(root, "Properties")
    ET.SubElement(props, "Property", {"name": "defaultCloseOperation", "type": "int", "value": str(spec["close"])})
    if spec["title"]:
        ET.SubElement(props, "Property", {"name": "title", "type": "java.lang.String", "value": spec["title"]})
    ET.SubElement(props, "Property", {"name": "resizable", "type": "boolean", "value": str(spec["resizable"]).lower()})
    if spec["undecorated"]:
        ET.SubElement(props, "Property", {"name": "undecorated", "type": "boolean", "value": "true"})
    dim_xml(props, "size", spec["width"], spec["height"])
    if "minWidth" in spec:
        dim_xml(props, "minimumSize", spec["minWidth"], spec["minHeight"])
    synth = ET.SubElement(root, "SyntheticProperties")
    ET.SubElement(synth, "SyntheticProperty", {"name": "formSizePolicy", "type": "int", "value": "1"})
    ET.SubElement(synth, "SyntheticProperty", {"name": "generateCenter", "type": "boolean", "value": str(spec["center"]).lower()})
    aux = ET.SubElement(root, "AuxValues")
    aux_values = [
        ("FormSettings_autoResourcing", "java.lang.Integer", "0"),
        ("FormSettings_autoSetComponentName", "java.lang.Boolean", "false"),
        ("FormSettings_generateFQN", "java.lang.Boolean", "true"),
        ("FormSettings_generateMnemonicsCode", "java.lang.Boolean", "false"),
        ("FormSettings_i18nAutoMode", "java.lang.Boolean", "false"),
        ("FormSettings_layoutCodeTarget", "java.lang.Integer", "1"),
        ("FormSettings_listenerGenerationStyle", "java.lang.Integer", "3"),
        ("FormSettings_variablesLocal", "java.lang.Boolean", "false"),
        ("FormSettings_variablesModifier", "java.lang.Integer", "2"),
    ]
    for name, typ, value in aux_values:
        ET.SubElement(aux, "AuxValue", {"name": name, "type": typ, "value": value})
    layout = ET.SubElement(root, "Layout")
    for axis, size in (("0", str(spec["width"])), ("1", str(spec["height"]))):
        dl = ET.SubElement(layout, "DimensionLayout", {"dim": axis})
        group = ET.SubElement(dl, "Group", {"type": "103", "groupAlignment": "0", "attributes": "0"})
        ET.SubElement(group, "Component", {"id": "fondo", "min": "-2", "pref": size, "max": "32767", "attributes": "0"})
    nonvisual = ET.SubElement(root, "NonVisualComponents")
    for group in spec["groups"]:
        ET.SubElement(nonvisual, "Component", {"class": "javax.swing.ButtonGroup", "name": group})
    sub = ET.SubElement(root, "SubComponents")
    bg_panel = ET.SubElement(sub, "Container", {"class": "javax.swing.JPanel", "name": "fondo"})
    bgprops = ET.SubElement(bg_panel, "Properties")
    color_xml(bgprops, "background", spec["bg"])
    dim_xml(bgprops, "preferredSize", spec["width"], spec["height"])
    pnl = ET.SubElement(bg_panel, "Layout", {"class": ABS})
    ET.SubElement(pnl, "Property", {"name": "useNullLayout", "type": "boolean", "value": "false"})
    items = ET.SubElement(bg_panel, "SubComponents")
    for item in spec["components"]:
        node = ET.SubElement(items, "Component", {"class": TYPE_TO_JAVA[item["typ"]], "name": item["name"]})
        xml_properties(node, item)
        if item.get("event"):
            events = ET.SubElement(node, "Events")
            listener = "java.awt.event.ItemListener" if item["typ"] == "JCheckBox" else "java.awt.event.ActionListener"
            event_name = "itemStateChanged" if item["typ"] == "JCheckBox" else "actionPerformed"
            args = "java.awt.event.ItemEvent" if item["typ"] == "JCheckBox" else "java.awt.event.ActionEvent"
            ET.SubElement(events, "EventHandler", {"event": event_name, "listener": listener, "parameters": args, "handler": item["event"]})
        constraints = ET.SubElement(node, "Constraints")
        con = ET.SubElement(constraints, "Constraint", {"layoutClass": ABS, "value": ABS + "$AbsoluteConstraintsDescription"})
        ET.SubElement(con, "AbsoluteConstraints", {"x": str(item["x"]), "y": str(item["y"]), "width": str(item["w"]), "height": str(item["h"])})
    tree = ET.ElementTree(root)
    ET.indent(tree, space="  ")
    return ET.tostring(root, encoding="UTF-8", xml_declaration=True).decode("UTF-8")


def java_source(class_name, spec):
    parent_type = "java.awt.Frame" if spec["kind"] == "dialog" else None
    extends = "javax.swing.JFrame" if spec["kind"] == "frame" else "javax.swing.JDialog"
    lines = [
        "/*", " * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license",
        f" * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/{'JFrame' if spec['kind'] == 'frame' else 'JDialog'}.java to edit this template",
        " */", "package vistas;", "", f"public class {class_name} extends {extends} {{", "",
    ]
    if spec["kind"] == "frame":
        lines += [f"    public {class_name}() {{", "        initComponents();", "        setLocationRelativeTo(null);", "    }", ""]
    else:
        lines += [
            f"    public {class_name}(java.awt.Frame parent, boolean modal) {{", "        super(parent, modal);", "        initComponents();", "        setLocationRelativeTo(parent);", "    }", "",
        ]
        if class_name in ("NuevoFormulario", "Resultados", "GraficoUno", "GraficoDos"):
            lines += [
                f"    public {class_name}(java.awt.Dialog parent, boolean modal) {{", "        super(parent, modal);", "        initComponents();", "        setLocationRelativeTo(parent);", "    }", "",
            ]
        if class_name == "Principal":
            lines[5] = "        instalarAjusteDeTamano();"
            lines += [
                "    private void ajustarInterfaz() {", "        int ancho = fondo.getWidth();", "        int alto = fondo.getHeight();",
                "        barraSuperior.setBounds(0, 0, ancho, 140);", "        contenidoPrincipal.setBounds(0, 140, ancho, alto - 180);",
                "        barraInferior.setBounds(0, alto - 40, ancho, 40);", "        imagenLogo.setBounds(ancho - 172, 17, 120, 120);",
                "        botonNuevaEncuesta.setBounds(ancho / 2 - 250, alto / 2 - 41, 200, 100);",
                "        botonResultados.setBounds(ancho / 2 + 50, alto / 2 - 41, 200, 100);", "    }", "",
                "    private void instalarAjusteDeTamano() {", "        fondo.addComponentListener(new java.awt.event.ComponentAdapter() {",
                "            @Override", "            public void componentResized(java.awt.event.ComponentEvent evt) {", "                ajustarInterfaz();", "            }", "        });", "        ajustarInterfaz();", "    }", "",
            ]
    lines += [
        "    @SuppressWarnings(\"unchecked\")", "    // <editor-fold defaultstate=\"collapsed\" desc=\"Generated Code\">//GEN-BEGIN:initComponents",
        "    private void initComponents() {", "",
    ]
    for group in spec["groups"]:
        lines.append(f"        {group} = new javax.swing.ButtonGroup();")
    lines.append("        fondo = new javax.swing.JPanel();")
    for item in spec["components"]:
        lines.append(f"        {item['name']} = new {TYPE_TO_JAVA[item['typ']] }();")
    lines.append("")
    lines.append(f"        setDefaultCloseOperation(javax.swing.WindowConstants.{ 'EXIT_ON_CLOSE' if spec['close'] == 3 else 'DISPOSE_ON_CLOSE' });")
    if spec["title"]:
        lines.append(f"        setTitle(\"{spec['title']}\");")
    lines.append(f"        setResizable({str(spec['resizable']).lower()});")
    if spec["undecorated"]:
        lines.append("        setUndecorated(true);")
    if class_name == "Principal":
        lines.append("        setMinimumSize(new java.awt.Dimension(1060, 700));")
    lines += [
        f"        fondo.setBackground(new java.awt.Color({rgb(spec['bg'])[0]}, {rgb(spec['bg'])[1]}, {rgb(spec['bg'])[2]}));",
        f"        fondo.setPreferredSize(new java.awt.Dimension({spec['width']}, {spec['height']}));",
        "        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());", "",
    ]
    for item in spec["components"]:
        name, typ = item["name"], item["typ"]
        if "text" in item:
            lines.append(f"        {name}.setText(\"{item['text'].replace('\\', '\\\\').replace(chr(34), '\\"')}\");")
        for prop, method in (("bg", "setBackground"), ("fg", "setForeground")):
            if prop in item:
                r, g, b = rgb(item[prop])
                lines.append(f"        {name}.{method}(new java.awt.Color({r}, {g}, {b}));")
        if "font" in item:
            lines.append(f"        {name}.setFont(new java.awt.Font(\"Tahoma\", {1 if item.get('bold') else 0}, {item['font']}));")
        if "icon" in item:
            lines.append(f"        {name}.setIcon(new javax.swing.ImageIcon(getClass().getResource(\"/img/{item['icon']}\")));" )
        for prop in ("opaque", "enabled", "editable", "focusPainted", "borderPainted", "contentAreaFilled"):
            if prop in item:
                lines.append(f"        {name}.set{prop[0].upper()+prop[1:]}({str(item[prop]).lower()});")
        if "align" in item:
            lines.append(f"        {name}.setHorizontalAlignment({item['align']});")
        if "tooltip" in item:
            lines.append(f"        {name}.setToolTipText(\"{item['tooltip']}\");")
        if "border" in item:
            r, g, b = rgb(item["border"])
            lines.append(f"        {name}.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color({r}, {g}, {b})));" )
        if "group" in item:
            lines.append(f"        {item['group']}.add({name});")
        if item.get("event"):
            event = item["event"]
            if typ == "JCheckBox":
                lines.append(f"        {name}.addItemListener(evt -> {event}(evt));")
            else:
                lines.append(f"        {name}.addActionListener(evt -> {event}(evt));")
        lines.append(f"        fondo.add({name}, new org.netbeans.lib.awtextra.AbsoluteConstraints({item['x']}, {item['y']}, {item['w']}, {item['h']}));")
        lines.append("")
    lines += [
        "        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());", "        getContentPane().setLayout(layout);",
        "        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)",
        f"            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, {spec['width']}, Short.MAX_VALUE));",
        "        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)",
        f"            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, {spec['height']}, Short.MAX_VALUE));",
        "        pack();", f"        setSize(new java.awt.Dimension({spec['width']}, {spec['height']}));", "    }// </editor-fold>//GEN-END:initComponents", "",
    ]
    handlers = {
        "Login": [
            "    private void abrirPrincipal(java.awt.event.ActionEvent evt) {", "        dispose();", "        new Principal(null, false).setVisible(true);", "    }", "",
            "    private void abrirRegistro(java.awt.event.ActionEvent evt) {", "        setVisible(false);", "        Registro dialog = new Registro(this, true);", "        dialog.setLocationRelativeTo(this);", "        dialog.setVisible(true);", "        setVisible(true);", "    }", "",
            "    private void cerrarAplicacion(java.awt.event.ActionEvent evt) {", "        System.exit(0);", "    }", "",
        ],
        "Registro": [
            "    private void volverLogin(java.awt.event.ActionEvent evt) {", "        java.awt.Window parent = getOwner();", "        dispose();", "        if (parent != null) {", "            parent.setVisible(true);", "        }", "    }", "",
        ],
        "Principal": [
            "    private void abrirEncuesta(java.awt.event.ActionEvent evt) {", "        new NuevoFormulario(this, true).setVisible(true);", "    }", "",
            "    private void abrirResultados(java.awt.event.ActionEvent evt) {", "        new Resultados(this, true).setVisible(true);", "    }", "",
        ],
        "NuevoFormulario": [
            "    private void alternarCorreo(java.awt.event.ItemEvent evt) {", "        boolean activo = checkEnviarEmail.isSelected();", "        campoEmail.setEnabled(activo);", "        botonEnviarEmail.setEnabled(activo);", "    }", "",
        ],
        "Resultados": [
            "    private void abrirGraficoBarras(java.awt.event.ActionEvent evt) {", "        new GraficoUno(this, true).setVisible(true);", "    }", "",
            "    private void abrirGraficoCircular(java.awt.event.ActionEvent evt) {", "        new GraficoDos(this, true).setVisible(true);", "    }", "",
        ],
    }
    lines += handlers.get(class_name, [])
    if class_name == "Login":
        lines += [
            "    public static void main(String[] args) {", "        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));", "    }", "",
        ]
    lines.append("    // Variables declaration - do not modify//GEN-BEGIN:variables")
    lines.append("    private javax.swing.JPanel fondo;")
    for group in spec["groups"]:
        lines.append(f"    private javax.swing.ButtonGroup {group};")
    for item in spec["components"]:
        lines.append(f"    private {TYPE_TO_JAVA[item['typ']]} {item['name']};")
    lines += ["    // End of variables declaration//GEN-END:variables", "}", ""]
    return "\n".join(lines)


for cls, spec in screens.items():
    (SRC / f"{cls}.java").write_text(java_source(cls, spec), encoding="utf-8", newline="\n")
    (SRC / f"{cls}.form").write_text(form_xml(cls, spec), encoding="utf-8", newline="\n")
print("Generated NetBeans forms:", ", ".join(screens))
