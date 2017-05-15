package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;


public class PresidentDAOFileImpl implements PresidentDAO {
	Map<Integer, President> presList = new HashMap<>();
	ServletContext servletContext;

	public PresidentDAOFileImpl (ServletContext s){
		servletContext = s;
		loadPresidentsInHashMap();
	}

	private void loadPresidentsInHashMap() {
		InputStream is = servletContext.getResourceAsStream("WEB-INF/presidents.psv");
		try (BufferedReader buf = new BufferedReader(new InputStreamReader(is))) {
			String line;
			while ((line = buf.readLine()) != null) {
				String[] param = line.split("\\|");
//				System.out.println(Arrays.deepToString(param));
				Integer termNumber = Integer.parseInt(param[0]);
				String name = param[1];
				String startTerm = param[2];
				String endTerm = param[3];
				String party = param[4];
				String picURL = param[5];
				String fact = param[6];
				President pres = new President(termNumber, name, party, startTerm, endTerm, picURL, fact);
				presList.put(termNumber, pres);

			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public List<President> getAllPresidents() {
		return new ArrayList<>(presList.values());
	}


	@Override
	public President getPresident(int termNumber) {
		President pres = presList.get(termNumber);
		return pres;
	}

}
