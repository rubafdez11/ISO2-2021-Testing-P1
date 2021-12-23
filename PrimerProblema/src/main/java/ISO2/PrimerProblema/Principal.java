package ISO2.PrimerProblema;

public class Principal {

	public static void main(String[] args) {

		System.out.println(ejercicio1(true, false, false, true, true, true, false, true, true, -1, 5, 1200, 1300, 802, 934, 1000, 1003, 500, 548));
;
	}

	public static String ejercicio1(boolean sana, boolean sintomas, boolean contactoInfectado, boolean pasoCovid,
			boolean pasaporteCovid, boolean nieve, boolean agua, boolean nublado, boolean confinamiento,
			int temperatura, int humedad, int aforoEsquiar, int aforoEsquiarMax, int aforoSenderismo,
			int aforoSenderismoMax, int aforoCañas, int aforoCañasMax, int aforoPiscina, int aforoPiscinaMax) {
		
		String resultado="";

		if (sana == true && sintomas == false && contactoInfectado == false && pasoCovid == true
				&& pasaporteCovid == true) {

			if (temperatura < 0 && humedad < 15 && (nieve || agua)) {
				resultado+="Lo mejor es quedarse en casa. ";
			}
			if (temperatura < 0 && humedad < 15 && nieve == false && agua == false && aforoEsquiar < aforoEsquiarMax) {
				resultado+="Me puedo ir a esquiar. ";
			}
			if (temperatura >= 0 && temperatura <= 15 && agua == false && aforoSenderismo < aforoSenderismoMax) {
				resultado+="Me puedo ir de senderismo. ";
			}
			if (temperatura >= 15 && temperatura <= 25 && nublado == false && humedad > 60 && confinamiento == false) {
				resultado+="Me puedo ir a hacer turismo. ";
			}
			if (temperatura >= 25 && temperatura <= 35 && agua == false && aforoCañas < aforoCañasMax) {
				resultado+="Me puedo ir de cañas. ";
			}
			if (temperatura > 30 && agua == false) {
				resultado+="Me puedo ir a la playa. ";

				if (aforoPiscina < aforoPiscinaMax) {
					resultado+="Me puedo ir a la piscina. ";
				}

			}
		}
		
		return resultado;

	}

}
