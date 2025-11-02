# 🧾 Gerador de QR Code com Spring Boot

Aplicação **Java Spring Boot** que gera **QR Codes** dinâmicos a partir de qualquer texto, link ou dado informado.  
O sistema utiliza a biblioteca **ZXing** para criar imagens em formato **PNG** e expõe uma **API REST** simples e eficiente.

---

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3**
- **Maven**
- **ZXing (Google QR Code Library)**
- **Tomcat (embutido)**

---

## ⚙️ Estrutura do Projeto

QRCodeGenerator/
├── src/
│ ├── main/java/com/example/QRCodeGenerator/
│ │ ├── controller/QRCodeController.java
│ │ ├── service/QRCodeService.java
│ │ └── QrCodeGeneratorApplication.java
│ └── main/resources/
│ └── application.properties
├── pom.xml
└── README.md

---

## 📦 Instalação e Execução

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/SEU_USUARIO/QRCodeGenerator.git
cd QRCodeGenerator

2️⃣ Compilar o projeto
mvn clean install

3️⃣ Executar o servidor
mvn spring-boot:run

O servidor iniciará em:

http://localhost:8080

🧠 Como Usar a API

A API possui apenas um endpoint principal para gerar QR Codes.

🔹 Endpoint

GET

http://localhost:8080/api/qrcode?text=SEU_TEXTO_AQUI

🔹 Exemplo de uso no Postman

Abra o Postman

Crie uma nova requisição do tipo GET

Use a URL:

http://localhost:8080/api/qrcode?text=Olá+Mundo


Clique em Send

O retorno será uma imagem PNG contendo o QR Code gerado.

💡 Para salvar a imagem:

Vá em Save Response → Save to a file

Escolha o nome: qrcode.png

💾 Exemplo de resposta

O endpoint retorna bytes de imagem (PNG).
Você pode abrir o arquivo salvo e escanear com o celular.

🧾 Licença

Este projeto é de uso livre para fins educacionais e experimentais.
Sinta-se à vontade para clonar, modificar e melhorar.

👨‍💻 Autor

Lucas Viana
📧 Contato: (lucasvianasouza4@gmail.com)
💼 GitHub: https://github.com/Lcvianasz

🌀 “Gerar conhecimento é como gerar QR Codes: cada ponto leva a um novo destino.”
