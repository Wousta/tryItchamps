import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PlantillaFast {

	private static FastReader in = new FastReader();
	private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) {

		//

		out.flush();
		out.close();
		in.close();

	}

	static class FastReader {
		BufferedReader in = null;
		StringTokenizer st;

		public FastReader() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastReader(InputStream is) {
			in = new BufferedReader(new InputStreamReader(is));
		}

		public boolean hasNext() {
			if (st != null && st.hasMoreTokens()) {
				return true;
			}
			String tmp;
			try {
				in.mark(20);
				tmp = in.readLine();
				if (tmp == null) {
					return false;
				}
				in.reset();
			} catch (IOException e) {
				return false;
			}
			return true;
		}

		public String next() {
			try {
				while (st == null || !st.hasMoreTokens()) {
					st = new StringTokenizer(in.readLine());
				}
			} catch (Exception e) {
				return null;
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
            return Long.parseLong(next());
        }
		
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		
		public String nextLine() {
            try {
                return in.readLine();
            } catch (IOException e) {
            }
            return null;
        }

		public void close() {
			try {
				in.close();
			} catch (IOException e) {
			}
		}
	}

}
