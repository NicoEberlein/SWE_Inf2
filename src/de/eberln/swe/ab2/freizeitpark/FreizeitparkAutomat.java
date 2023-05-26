package de.eberln.swe.ab2.freizeitpark;

import de.eberln.swe.ab2.freizeitpark.FreizeitparkHelper.CardType;

// Aufgabe Freizeitpark
public class FreizeitparkAutomat {
	
	public enum Action {
		ABBRUCH,
		ACHTERBAHN,
		EXTRARUNDE,
		KARUSELL,
		EURO1,
		CENT50
	}
	
	public enum FreizeitparkState {
		KARUSELL{

			@Override
			FreizeitparkState performAction(Action action) {
				switch (action) {
				case ABBRUCH: return WARTEN;
				case CENT50: helper.printTicket(CardType.KARUSELL); return WARTEN;
				case EURO1: helper.printTicket(CardType.KARUSELL); helper.giveMoneyBack(0.5); return WARTEN;
				default: return KARUSELL;
				}
			}
			
		},
		ACHTERBAHN{
			
			@Override
			FreizeitparkState performAction(Action action) {				
				return switch(action) {
					case ABBRUCH -> {
						yield WARTEN;
					}
					case EURO1 -> {
						helper.printTicket(CardType.ACHTERBAHN); yield WARTEN;
					}
					case CENT50 -> {
						yield A50;
					}
					case EXTRARUNDE -> {
						yield EXTRARUNDE;
					}
					default -> {
						yield ACHTERBAHN;
					}
				};
			}
			
		},
		EXTRARUNDE{
			
			@Override
			FreizeitparkState performAction(Action action) {
				switch (action) {
				case ABBRUCH: return WARTEN;
				case CENT50: return E50;
				case EURO1: return E100;
				default: return EXTRARUNDE;
				}
			}
			
		},
		E50{
			
			@Override
			FreizeitparkState performAction(Action action) {
				switch (action) {
				case ABBRUCH: helper.giveMoneyBack(0.5); return WARTEN;
				case CENT50: return E100;
				case EURO1: helper.printTicket(CardType.EXTRARUNDE); return WARTEN;
				default: return E50;
				}
			}
			
		},
		E100{
			
			@Override
			FreizeitparkState performAction(Action action) {
				switch (action) {
				case ABBRUCH: helper.giveMoneyBack(1); return WARTEN;
				case CENT50: helper.printTicket(CardType.EXTRARUNDE); return WARTEN;
				case EURO1: helper.giveMoneyBack(0.5); helper.printTicket(CardType.EXTRARUNDE); return WARTEN;
				default: return E100;
				}
			}
			
		},
		A50{
			
			@Override
			FreizeitparkState performAction(Action action) {
				if(action == Action.ABBRUCH) {
					helper.giveMoneyBack(0.5);
					return WARTEN;
				}else if(action == Action.CENT50) {
					helper.printTicket(CardType.ACHTERBAHN);
					return WARTEN;
				}else if(action == Action.EURO1) {
					helper.giveMoneyBack(1);
					helper.printTicket(CardType.ACHTERBAHN);
					return WARTEN;
				}else {
					return A50;
				}
			}
			
		},
		WARTEN{
			
			@Override
			FreizeitparkState performAction(Action action) {
				if(action == Action.ACHTERBAHN) {
					return ACHTERBAHN;
				}else if(action == Action.KARUSELL) {
					return KARUSELL;
				}else {
					return WARTEN;
				}
			}
			
		};
		
		FreizeitparkHelper helper = new FreizeitparkHelper();
		
		abstract FreizeitparkState performAction(Action action);
		
	}
	
	private FreizeitparkState state;
	
	public FreizeitparkAutomat() {
		state = FreizeitparkState.WARTEN;
	}
	
	public void performAction(Action action) {
		state = state.performAction(action);
	}

}
