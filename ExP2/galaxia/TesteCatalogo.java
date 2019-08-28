package galaxia;

public class TesteCatalogo 
{

	public static void main(String[] args) 
	{
		Astro a0 = new Estrela("Sol", new ValorAstro(1.9891, "x 10^30 kg"), "Anã Amarela", new ValorAstro(4.5, "Bilhões de Anos"));
		Astro a1 = new Planeta("Mercurio", new ValorAstro(330.104, "x 10^21 kg"), "Terrestre", new ValorAstro(58.646, "Dias"), new ValorAstro(0.2408467, "Anos"), 0);
		Astro a2 = new Planeta("Venus", new ValorAstro(4.86732, "x 10^24 kg"), "Terrestre", new ValorAstro(-243.018, "Dias"), new ValorAstro(0.61519726, "Anos"), 0);
		Astro a3 = new Planeta("Terra", new ValorAstro(5.97219, "x 10^24 kg"), "Terrestre", new ValorAstro(0.99726968, "Dias"), new ValorAstro(1.0000174, "Anos"), 1);
		Astro a4 = new Planeta("Marte", new ValorAstro(641.693, "x 10^21 kg"), "Terrestre", new ValorAstro(1.026, "Dias"), new ValorAstro(1.8808476, "Anos"), 2);
		Astro a5 = new Planeta("Jupiter", new ValorAstro(1.89813, "x 10^27 kg"), "Gigante Gasoso", new ValorAstro(0.41354, "Dias"), new ValorAstro(11.862615, "Anos"), 79);
		Astro a6 = new Planeta("Saturno", new ValorAstro(568.319, "x 10^24 kg"), "Gigante Gasoso", new ValorAstro(0.444, "Dias"), new ValorAstro(29.447498, "Anos"), 63);
		Astro a7 = new Planeta("Urano", new ValorAstro(86.8103, "x 10^24 kg"), "Gigante Gelado", new ValorAstro(-0.718, "Dias"), new ValorAstro(84.016846, "Anos"), 27);
		Astro a8 = new Planeta("Netuno", new ValorAstro(102.41, "x 10^24 kg"), "Gigante Gelado", new ValorAstro(0.671, "Dias"), new ValorAstro(164.79132, "Anos"), 14);
		Astro a9 = new Planeta("Ceres", new ValorAstro(947, "x 10^18 kg"), "Anão", new ValorAstro(0.378, "Dias"), new ValorAstro(4.599, "Anos"), 0);
		Astro a10 = new Planeta("Plutao", new ValorAstro(13.09, "x 10^21 kg"), "Anão", new ValorAstro(-6.4, "Dias"), new ValorAstro(248.54, "Anos"), 5);
		Astro a11 = new Planeta("Haumea", new ValorAstro(4.01, "x 10^21 kg"), "Anão", new ValorAstro(0.163, "Dias"), new ValorAstro(285.4, "Anos"), 2);
		Astro a12 = new Planeta("Makemake", new ValorAstro(3, "x 10^21 kg"), "Anão", new ValorAstro(0.9367, "Dias"), new ValorAstro(309.88, "Anos"), 0);
		Astro a13 = new Planeta("Eris", new ValorAstro(16.6, "x 10^21"), "Anão", new ValorAstro(1.079, "Dias"), new ValorAstro(557, "Anos"), 1);
		Astro a14 = new Lua("Lua", new ValorAstro(73.48, "x 10^21 kg"), "Terra");
		Astro a15 = new Lua("Deimos", new ValorAstro(1.48, "x 10^15 kg"), "Marte");
		Astro a16 = new Lua("Phobos", new ValorAstro(10.66, "x 10^15 kg"), "Marte");
		Astro a17 = new Lua("Europa", new ValorAstro(48, "x 10^21 kg"), "Jupiter");
		Astro a18 = new Lua("Charon", new ValorAstro(1.547, "x 10^21 kg"), "Plutao");
		Astro a19 = new CorpoPequeno("101955 Bennu", new ValorAstro(78, "x 10^9 kg"), "Asteroide Tipo-B");
		Astro a20 = new CorpoPequeno("1P/Halley", new ValorAstro(220, "x 10^12 kg"), "Cometa de Curto-Periodo");
		Astro a21 = new Artificial("Estacao Espacial Internacional", "Estacao Espacial", "Orbita da Terra");
		Astro a22 = new Artificial("LISA Pathfinder", "Telescopio Espacial - Onda Gravitacional", "Orbita Heliocentrica");
		
		SistemaSolar s0 = new SistemaSolar();
		
		s0.cadastrarAstro(a0);
		s0.cadastrarAstro(a1);
		s0.cadastrarAstro(a2);
		s0.cadastrarAstro(a3);
		s0.cadastrarAstro(a4);
		s0.cadastrarAstro(a5);
		s0.cadastrarAstro(a6);
		s0.cadastrarAstro(a7);
		s0.cadastrarAstro(a8);
		s0.cadastrarAstro(a9);
		s0.cadastrarAstro(a10);
		s0.cadastrarAstro(a11);
		s0.cadastrarAstro(a12);
		s0.cadastrarAstro(a13);
		s0.cadastrarAstro(a14);
		s0.cadastrarAstro(a15);
		s0.cadastrarAstro(a16);
		s0.cadastrarAstro(a17);
		s0.cadastrarAstro(a18);
		s0.cadastrarAstro(a19);
		s0.cadastrarAstro(a20);
		s0.cadastrarAstro(a21);
		s0.cadastrarAstro(a22);
		
		System.out.println(s0.imprimirSistema());
	}

}
