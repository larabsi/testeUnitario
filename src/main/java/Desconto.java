public class Desconto {
    public String sexo;
    public String cupom;

    public String resultado;

    public Desconto() {

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

    public String getCupom() {
        return cupom;
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }


    public Desconto(String sexo, String cupom) {
        this.setSexo(sexo);
        this.cupom = cupom;
    }

    public String definirDesconto() {
        if (cupom.equals("DESCONTO10")) {
            resultado = "-10%";

        } else if (sexo.equals("Feminino")) {
            if (cupom.equals("MESDAMULHER")) {
                resultado = "-30%";

            } else if (cupom.equals("PERFUME15")) {
                resultado = "15% OFF em perfumes";

            } else {
                resultado = "Sem cupom válido";
            }

        } else {
            resultado = "Sem cupom válido";
        }

        return resultado;
    }
}