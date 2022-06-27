
public class principal {
public static void main(String[] args) {
	conexao con = new conexao();
	String sql = "Insert Into equipment360 (id, equipment_model_id, nome, color, data_posicao_registrada, longitude, latitude, estado_de_equipamento,ganhos_por_hora_por_estado, histórico_de_estados_de_um_equipamento)" +
	"Values (default, 'Modelo Aiko360', 'EquipmentAiko', 'laranja', '2022/06/26', -19.97851146, -44.21173096, 'parado', 1500, 'parado, manutenção, parado, operando, operando,parado')";
	
	
	int res = con.executaSQL(sql);
	if (res >0) {
		System.out.println("Cadastrado com sucesso");
		}else {
			System.out.println("Erro durante o cadastro");
		}
}
}
