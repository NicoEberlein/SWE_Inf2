package de.eberln.swe.ab2;

// Aufgabe 5
public class GleitkommaAutomat {

	public enum GleitkommaState {
		
		INITIAL {
			@Override
			GleitkommaState applyChar(char parameter) {
				if(parameter == '+' || parameter == '-') {
					return VORZ;
				}else if(Character.isDigit(parameter)) {
					return VALID1;
				}else if(parameter == 'E' || parameter == 'e') {
					return E;
				}
				return INVALID;
			}
		},
		VORZ {
			@Override
			GleitkommaState applyChar(char parameter) {
				if(Character.isDigit(parameter)) {
					return VALID1;
				}
				return INVALID;
			}
		},
		VALID1 {
			@Override
			GleitkommaState applyChar(char parameter) {
				if(Character.isDigit(parameter)) {
					return VALID1;
				}else if(parameter == ',') {
					return KOMMA;
				}else if(parameter == 'E' || parameter == 'e') {
					return E;
				}
				return INVALID;
			}
		},
		KOMMA {
			@Override
			GleitkommaState applyChar(char parameter) {
				if(Character.isDigit(parameter)) {
					return VALID2;
				}
				return INVALID;
			}
		},
		VALID2 {
			@Override
			GleitkommaState applyChar(char parameter) {
				if(Character.isDigit(parameter)) {
					return VALID2;
				}else if(parameter == 'E' || parameter == 'e') {
					return E;
				}
				return INVALID;
			}
		},
		E {
			@Override
			GleitkommaState applyChar(char parameter) {
				if(Character.isDigit(parameter)) {
					return VALID3;
				}else if(parameter == '+' || parameter == '-') {
					return EPLUS;
				}
				return INVALID;
			}
		},
		EPLUS {
			@Override
			GleitkommaState applyChar(char parameter) {
				if(Character.isDigit(parameter)) {
					return VALID3;
				}
				return INVALID;
			}
		},
		VALID3 {
			@Override
			GleitkommaState applyChar(char parameter) {
				if(Character.isDigit(parameter)) {
					return VALID3;
				}
				return INVALID;
			}
		},
		INVALID {
			@Override
			GleitkommaState applyChar(char parameter) {
				return INVALID;
			}
		};
		
		static boolean isValid(GleitkommaState state) {
			if(state == VALID1 || state == VALID2 || state == VALID3) {
				return true;
			}
			return false;
		}
		
		abstract GleitkommaState applyChar(char parameter);
	}
	
	private GleitkommaState state;
	
	public GleitkommaAutomat() {
		state = GleitkommaState.INITIAL;
	}
	
	public boolean isValid(String s) {
		
		char[] chars = s.toCharArray();
		
		for(int i = 0; i<chars.length;i++) {
			state = state.applyChar(chars[i]);
		}
		
		GleitkommaState tmp = state;
		state = GleitkommaState.INITIAL;
		
		return GleitkommaState.isValid(tmp);
	}
	
}
