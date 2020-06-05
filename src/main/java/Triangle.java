
public class Triangle {
	public String CheckTriangle(double a, double b, double c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return "ぃ琌à";
		}
		if (a+b > c && b+c > a && c+a > b) {
			if (a == b) {
				if (b == c) {
					return "タà";
				}
				else if (a*a + b*b - c*c <= 0.04*a*a) {
					return "单竬àà";
				}
				else {
					return "单竬à";
				}
			}
			else if (b == c) {
				if (b*b + c*c - a*a <= 0.04*b*b) {
					return "单竬àà";
				}
				else {
					return "单竬à";
				}
			}
			else if(a == c){
					if (a*a + c*c - b*b <= 0.04*a*a) {
						return "单竬àà";
					}
					else {
						return "单竬à";
					}
			}
			if (a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b) {
				return "àà";
			}
			else {
				return "à";
			}
		}
		return "ぃ琌à";
	}
}
