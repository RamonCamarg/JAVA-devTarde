// A classe Task representa uma tarefa com uma descrição e um estado de conclusão.

public class Task {
    // Atributos
    String description; // A descrição da tarefa
    boolean done;       // Indica se a tarefa foi concluída ou não

    // Construtor
    // Inicializa uma nova tarefa com a descrição fornecida e define o estado de conclusão como falso (não concluído).
    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    // Getters and Setters

    // Obtém a descrição da tarefa.
    public String getDescription() {
        return description;
    }

    // Define a descrição da tarefa para o valor fornecido.
    public void setDescription(String description) {
        this.description = description;
    }

    // Verifica se a tarefa foi concluída.
    public boolean isDone() {
        return done;
    }

    // Define o estado de conclusão da tarefa para o valor fornecido.
    public void setDone(boolean done) {
        this.done = done;
    }
}
