import java.util.ArrayList;

public class Path {

	public static String reduce_file_path(String rawPath) {

		rawPath = rawPath.replaceAll("\\/\\/+", "/");

		String[] pathList = rawPath.split("/");

		if (pathList.length == 0) {

			return "/";

		}

		ArrayList<String> result = new ArrayList<String>();

		for (String location : pathList) {

			if (location.equals(".")) {

				continue;

			} else if (location.equals("..")) {

				result.remove(result.size() - 1);

				continue;

			}

			result.add(location);

		}

		StringBuilder pathStringBuilder = new StringBuilder();

		for (String location : result) {

			pathStringBuilder.append(location);

			pathStringBuilder.append("/");

		}

		pathStringBuilder.deleteCharAt(pathStringBuilder.length() - 1);

		return pathStringBuilder.toString();

	}

	public static void main(String[] args) {

		System.out.println(reduce_file_path("home/pictures/././"));
		System.out.println(reduce_file_path("/////////////"));
		System.out.println(reduce_file_path("/path/bla//////bla////bla/slav////////"));
		System.out.println(reduce_file_path("/......./"));
	}
}
