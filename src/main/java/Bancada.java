public class Bancada {

    private int id;
    private String nomeCultura;
    private String dataPlantio;
    private String dataPrevistaColheita;
    private int capacidadeReservatorio;
    private int maxUnidadesPlantio;

    public Bancada(){
        this.nomeCultura = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCultura() {
        return nomeCultura;
    }

    public void setNomeCultura(String nomeCultura) {
        this.nomeCultura = nomeCultura;
    }

    public String getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(String dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public String getDataPrevistaColheita() {
        return dataPrevistaColheita;
    }

    public void setDataPrevistaColheita(String dataPrevistaColheita) {
        this.dataPrevistaColheita = dataPrevistaColheita;
    }

    public int getCapacidadeReservatorio() {
        return capacidadeReservatorio;
    }

    public void setCapacidadeReservatorio(int capacidadeReservatorio) {
        this.capacidadeReservatorio = capacidadeReservatorio;
    }

    public int getMaxUnidadesPlantio() {
        return maxUnidadesPlantio;
    }

    public void setMaxUnidadesPlantio(int maxUnidadesPlantio) {
        this.maxUnidadesPlantio = maxUnidadesPlantio;
    }
}
