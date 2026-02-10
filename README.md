# Posts App

Um aplicativo Android moderno que exibe uma lista de posts consumindo uma API REST.

## 📋 Sobre o Projeto

Posts App é um aplicativo Android desenvolvido em Kotlin que demonstra boas práticas de desenvolvimento mobile, incluindo:
- Consumo de APIs RESTful com Retrofit
- View Binding para acesso seguro a views
- Serialização/desserialização de JSON com Gson
- Arquitetura limpa e modular

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Kotlin
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 36 (Android 15)
- **Build System**: Gradle 8.x com Kotlin DSL
- **Bibliotecas Principais**:
  - [AndroidX AppCompat](https://developer.android.com/jetpack/androidx/releases/appcompat)
  - [Material Design 3](https://material.io/components)
  - [Retrofit 2](https://square.github.io/retrofit/) - Cliente HTTP
  - [Gson](https://github.com/google/gson) - Serialização JSON
  - [ConstraintLayout](https://developer.android.com/reference/androidx/constraintlayout/widget/ConstraintLayout)
  - [JUnit 4](https://junit.org/junit4/) - Testes Unitários
  - [Espresso](https://developer.android.com/training/testing/espresso) - Testes Instrumentalizados

## 📦 Dependências

O projeto utiliza Version Catalog (gradle/libs.versions.toml) para gerenciar todas as dependências.

## 🚀 Como Compilar e Executar

### Pré-requisitos
- Android Studio Arctic Fox ou superior
- JDK 11 ou superior
- Android SDK 36 instalado
- Gradle 8.x

### Passos
1. Clone o repositório
2. Abra o projeto no Android Studio
3. Sincronize as dependências do Gradle
4. Conecte um dispositivo Android ou inicie um emulador
5. Execute `./gradlew build` para compilar
6. Clique em "Run" (Shift + F10) para executar no dispositivo

## 📱 Funcionalidades

- Listagem de posts da API
- Exibição de detalhes dos posts
- Interface de usuário intuitiva com Material Design

## 🧪 Testes

### Testes Unitários
```bash
./gradlew test
```

### Testes Instrumentalizados
```bash
./gradlew connectedAndroidTest
```

## 📝 Estrutura do Projeto

```
app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── dev/nicolasmoraes/postsapp/
│   │   │       └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   ├── values/
│   │   │   └── ...
│   │   └── AndroidManifest.xml
│   ├── test/
│   │   └── java/
│   └── androidTest/
│       └── java/
└── build.gradle.kts
```

## 🎨 Interface do Usuário

![Image](https://github.com/user-attachments/assets/5a16e7b2-a869-4d9b-8e03-00939ab5f355)

## 📄 Licença

Este projeto é fornecido como exemplo educacional.

## 👨‍💻 Autor

Desenvolvido por Nicolas Moraes

