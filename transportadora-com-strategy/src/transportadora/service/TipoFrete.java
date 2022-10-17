package transportadora.service;

import transportadora.service.frete.GFL;
import transportadora.service.frete.JadLog;
import transportadora.service.frete.Normal;
import transportadora.service.frete.Sedex;

public enum TipoFrete {

	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	},
	GFL {
		@Override
		public Frete obterFrete() {
			return new GFL();
		}
	},
	JadLog{
		@Override
		public Frete obterFrete() {
			return new JadLog();
		}	
	};
	
	public abstract Frete obterFrete();	
}
