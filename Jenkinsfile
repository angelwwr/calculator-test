pipeline {
    agent any
    
    stages {
        stage('Clone') {
            steps {
                // Clona tu repositorio usando el token de acceso
                sh 'rm -rf my-java-repo'  // Elimina cualquier directorio anterior
                sh 'git clone https://github.com/angelwwr/calculator-test.git'  // Usa el token para autenticar la clonación
            }
        }
        
        stage('Compile') {
            steps {
                // Entra en el directorio del repositorio y ejecuta Maven para compilar
                dir('calculator-test') {
                    sh 'mvn clean compile'  // Comando Maven para limpiar y compilar el proyecto
                }
            }
        }
        
        stage('Test') {
            steps {
                // Entra en el directorio del repositorio y ejecuta Maven para las pruebas
                dir('calculator-test') {
                    sh 'mvn test'  // Ejecuta las pruebas unitarias de Maven
                }
            }
        }
    }

    post {
        always {
            // Opcional: Limpia el espacio de trabajo al final
            cleanWs()
        }
    }
}
