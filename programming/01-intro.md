# ☕ Fundamentos de Programación en Java

## 0. ¿Qué es Java?
**Java** es un lenguaje de programación de alto nivel y orientado a objetos.
*   **Filosofía:** "Escribe una vez, ejecuta en cualquier lugar" (*WORA*). Esto permite que el código Java se ejecute en cualquier dispositivo que tenga una Máquina Virtual de Java (JVM) sin necesidad de recompilación.

---

### Características Principales
*   **Tipado Fuerte:** Las variables deben ser declaradas con un tipo de dato específico y este no puede ser cambiado después de su declaración inicial.
*   **Gestión de Memoria:** Java utiliza un **Garbage Collector** (recolector de basura), que se encarga de liberar automáticamente la memoria que ya no está siendo utilizada.

---

## 1. Ecosistema y Entorno

Java cuenta con distintas ediciones y componentes esenciales:

*   **Java SE (Standard Edition):** Es la base de todo el ecosistema Java.
*   **Java EE (Enterprise Edition):** Se construye sobre Java SE para desarrollar aplicaciones empresariales complejas.

### Componentes de Ejecución y Desarrollo
| Componente | ¿Qué es? | Descripción |
| :--- | :--- | :--- |
| **JVM** | Java Virtual Machine | Es la máquina virtual que ejecuta el código compilado (*bytecode*), adaptándolo a distintos sistemas operativos. |
| **JRE** | Java Runtime Environment | Entorno de ejecución que contiene la JVM y librerías base. Requerido si **solo** quieres ejecutar aplicaciones Java. |
| **JDK** | Java Development Kit | Kit de desarrollo que incluye el JRE, el compilador (`javac`) y herramientas esenciales para **crear y depurar** código. |

> [!NOTE]
> Para este curso es indispensable instalar el **JDK**, ya que estaremos creando nuestro propio código.

---

## 2. Instalación y Configuración

### A. Descargar el JDK
Descargar e instalar el JDK desde Amazon Corretto
`https://docs.aws.amazon.com/corretto/latest/corretto-25-ug/windows-install.html`

### B. Configurar Variables de Entorno
*   `JAVA_HOME`: Establece la ruta donde se encuentra instalado el JDK.
    *   *Ejemplo: `C:\Program Files\Amazon Corretto\jdk25.0.3_9`*
*   `PATH`: Añade la ruta de los binarios para usar Java desde cualquier terminal.
    *   *Ejemplo: `C:\Program Files\Amazon Corretto\jdk25.0.3_9\bin`*

### C. Verificar Instalación
Abre tu terminal y ejecuta:
```bash
# Verifica que el entorno de ejecución está listo
java -version

# Verifica que el compilador está listo
javac -version
```

---

## 3. Entorno de Desarrollo (VS Code)

*   **Extensiones recomendadas:**
    *   `Extension Pack for Java`

---

## 4. Temario a Cubrir

- Variables y Tipos de datos primitivos
- Tipo String (cadenas de texto)
- Operadores y Estructuras de control
- Arreglos y Matrices
- Funciones/Métodos
- Valor vs Referencia
- Clases y Objetos
- Herencia y Polimorfismo
- Paquetes
