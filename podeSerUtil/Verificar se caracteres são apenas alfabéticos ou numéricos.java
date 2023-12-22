//O código abaixo retorna se "nome" contém apenas caracteres alfabéticos

public static boolean isNomeValido(String nome) {
      return nome.matches("[a-zA-Z]+"); // Verifica se o nome contém apenas caracteres alfabéticos
}

public static boolean isMatriculaValida(String matricula) {
    return matricula.matches("\\d+"); // Verifica se a matrícula contém APENAS números
}
