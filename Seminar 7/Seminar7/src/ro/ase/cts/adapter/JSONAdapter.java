package ro.ase.cts.adapter;
// Adapter for JSON
public class JSONAdapter implements DataReader {
	private JSONDataReader jsonReader;
	
	public JSONAdapter(JSONDataReader jsonReader) {
		this.jsonReader = jsonReader;
	}
	@Override
	public String readData() {
		return jsonReader.readJSON();
	}
	
}
