# 🎓 Curso de Git & GitHub

## 0. ¿Qué es Git y para qué sirve?
**Git** es un **sistema de control de versiones**. Es la herramienta que te permite gestionar el historial de cambios de tus programas y proyectos.
*   **¿Para qué sirve?** Te permite guardar "versiones" de tu código. Si una nueva funcionalidad rompe tu programa, puedes regresar exactamente a la versión anterior que funcionaba correctamente. Además, facilita el trabajo en equipo sobre un mismo proyecto sin sobrescribir el código de otros.

## ¿Qué es GitHub?
**GitHub** es una plataforma en la nube que aloja tus proyectos de Git. 
*   **La diferencia clave:** Git es la herramienta que instalas en tu computadora; GitHub es el sitio web donde "subes" y compartes esos proyectos con el resto del mundo o con tu equipo.

---

## 1. Conceptos Fundamentales
Git divide tu trabajo en tres áreas o estados lógicos.

### Las 3 Áreas de Git
*   **Working Directory (Directorio de Trabajo):** Es tu carpeta local donde están los archivos que estás editando. Aquí los cambios sólo están en tu computadora, git no los conoce (*untracked*).
*   **Staging Area (Área de Preparación):** Son cambios pendientes a ser confirmados. Aquí colocas los cambios que has decidido que formarán parte de tu próxima versión o entrega.
*   **Committed:** Es una versión confirmada de tu proyecto a la cual puedes volver en cualquier momento.

---

## 2. Configuración e Inicio
La primera vez que usamos Git en una computadora nueva:

```bash
# Identidad (Obligatorio)
git config --global user.name "Tu Nombre"
git config --global user.email "tu@email.com"

# Iniciar un proyecto
git init
```

---

## 3. Comandos de Flujo Diario
Este es el ciclo que repetirás constantemente: **Modificar → Preparar → Guardar → Subir**.

| Comando | Descripción |
| :--- | :--- |
| `git status` | El más importante. Te dice en qué área están tus archivos. |
| `git add <archivo>` | Pasa un archivo al Staging Area. |
| `git add .` | Pasa todos los cambios al Staging Area. |
| `git commit -m "mensaje"` | Guarda la versión en el Repositorio Local. |
| `git push origin main` | Sube tus commits locales a GitHub. |
| `git log --oneline` | Muestra el historial de versiones de forma resumida. |

### 💡 Buenas Prácticas: Los Commits
Un commit debe ser **atómico** (hace una sola cosa bien). El mensaje debe ser claro y descriptivo.

**✅ Ejemplos correctos:**
*   `feat: add login form validation`
*   `fix: resolve crash on mobile view`
*   `docs: update README with installation steps`
*   `style: change button color to primary blue`

---

## 4. "Viaje en el Tiempo" y Gestión de Errores
Git nos permite corregir errores.

### A. Navegar entre Commits (Solo ver)
Si quieres ver cómo estaba el código en el pasado sin borrar nada:
```bash
git checkout <ID-del-commit>
```
> [!NOTE]
> Para volver al presente, usa `git checkout main`.

### B. Corregir el último Commit (Sobreescribir)
Si hiciste un commit pero olvidaste un archivo o te equivocaste en el mensaje:
1. Añade el archivo que faltaba: `git add <archivo>`
2. Ejecuta: `git commit --amend -m "Nuevo mensaje corregido"`

### C. Deshacer cambios (Reset)
*   **Soft Reset (Arrepentimiento ligero):** `git reset --soft HEAD~1`. Borra el commit pero **mantiene tus cambios**.
*   **Hard Reset (Borrado total):** `git reset --hard HEAD~1`.
> [!CAUTION]
> El Hard Reset destruye todo el código que no hayas guardado.

---

## 5. Archivos Especiales

### .gitignore
Evita que archivos basura o sensibles suban a la nube (como `node_modules`, `.env`, o carpetas de compilación).
```text
/node_modules
/vendor
.env
```

### README.md
Es la cara de tu proyecto. Aquí debes explicar:
1. Qué hace el proyecto.
2. Cómo instalarlo/ejecutarlo.
3. Qué tecnologías usa.
