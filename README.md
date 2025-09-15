# 🏦 Proyecto Banco XYZ - Microservicios y BFFs

Este repositorio forma parte de una arquitectura distribuida compuesta por microservicios y BFFs que interactúan con una base de datos MySQL en contenedor Docker. Los BFFs están protegidos con HTTPS y Spring Security.

---

## 🔹 Microservicios

### 📁 ms-transaccion-bancoxyz

**Descripción:**  
Gestión de transacciones bancarios.
### ✅ `ms-transaccion-bancoxyz`

```markdown
# 📁 ms-transaccion-bancoxyz

**Descripción:**  
Microservicio que gestiona las transacciones bancarias (depósitos, retiros, transferencias).

**Tecnologías:**  
- Java 17 + Spring Boot  
- MySQL (contenedor Docker)  
- Maven

**Configuración rápida:**
```bash
git clone https://github.com/LeoOlivaresD/ms-transaccion-bancoxyz.git
mvn spring-boot:run
