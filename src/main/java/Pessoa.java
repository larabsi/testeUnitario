
public class Pessoa {

    public double peso;
    public String sexo;
    public double altura;
    public double imc;
    public String resultado;


    public Pessoa(double peso, String sexo, double altura) {

        this.peso = peso;
        this.sexo = sexo;
        this.altura = altura;
        this.imc = (peso / (altura * altura));

    }

    public Pessoa() {

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!(sexo.equals("Masculino") || sexo.equals("Feminino"))) {
            throw new IllegalArgumentException("Sexo invalido");

        }
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String calcularImc() {
        if (sexo.equals("Feminino")) {
            if (imc < 19.1) {
                resultado = "Abaixo do peso";
            } else if (imc < 25.8) {
                resultado = "Peso normal";
            } else if (imc < 27.3) {
                resultado = "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                resultado = "Acima do peso ideal";
            } else {
                resultado = "Obeso";
            }
        } else {
            if (imc < 20.7) {
                resultado = "Abaixo do peso";
            } else if (imc < 26.4) {
                resultado = "Peso normal";
            } else if (imc < 27.8) {
                resultado = "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                resultado = "Acima do peso ideal";
            } else {
                resultado = "Obeso";

            }
        }
        return resultado;

    }

}







