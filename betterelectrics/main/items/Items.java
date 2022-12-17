package betterelectrics.main.items;

import betterelectrics.main.blocks.BatteryBank;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Items {
	// scatole
	public static Item MgMnO2BoxedCell, HgOBoxedCell, AlkalineBoxedCell, Ag2OBoxedCell, LiSOCl2BoxedCell, LiFeS2BoxedCell;

	// elementari
	public static Item MgMnO2Cell, HgOCell, AlkalineCell, Ag2OCell, LiSOCl2Cell, LiFeS2Cell;
	// serie di 2
	public static Item MgMnO2Battery2s1p, HgOBattery2s1p, AlkalineBattery2s1p, Ag2OBattery2s1p, LiSOCl2Battery2s1p, LiFeS2Battery2s1p;
	
	// parallelo di 2
	public static Item MgMnO2Battery1s2p, HgOBattery1s2p, AlkalineBattery1s2p, Ag2OBattery1s2p, LiSOCl2Battery1s2p, LiFeS2Battery1s2p;
	
	// serie e parallelo di 2
	public static Item MgMnO2Battery2s2p, HgOBattery2s2p, AlkalineBattery2s2p, Ag2OBattery2s2p, LiSOCl2Battery2s2p, LiFeS2Battery2s2p;
	
	
    public static Item deadBattery, thinInoxPlate;

	public static void initItems() {
		
		MgMnO2BoxedCell = new ItemGeneric(14991, 64, "MgMnO2BoxedCell", 16, "Craft to get a battery");
		HgOBoxedCell = new ItemGeneric(14992, 65, "HgOBoxedCell", 16, "Craft to get a battery");
		AlkalineBoxedCell = new ItemGeneric(14993, 66, "AlkalineBoxedCell", 16, "Craft to get a battery");
		Ag2OBoxedCell = new ItemGeneric(14994, 67, "Ag2OBoxedCell", 16, "Craft to get a battery");
        LiSOCl2BoxedCell = new ItemGeneric(14995, 68, "LiSOCl2BoxedCell", 16, "Craft to get a battery");
        LiFeS2BoxedCell = new ItemGeneric(14996, 69, "LiFeS2BoxedCell", 16, "Craft to get a battery");
		
		
		
		deadBattery = new ItemGeneric(15000, 15, "deadBattery", 64, "Throw it in the trash");
		thinInoxPlate = new ItemGeneric(14999, 31, "thinInoxPlate", 64, "1 mm");
		MgMnO2Cell = new ItemPrimaryCell(15001, "MgMnO2Cell", 0, 15600, 1, 1, 30, "MgMnO₂");
		HgOCell = new ItemPrimaryCell(15002, "HgOCell", 1, 102000, 1, 1, 40, "HgO");
		AlkalineCell = new ItemPrimaryCell(15003, "AlkalineCell", 2, 21000, 1, 1, 50, "MnO₂");
		Ag2OCell = new ItemPrimaryCell(15004, "Ag2OCell", 3, 30000, 1, 1, 250, "Ag₂O");
		LiSOCl2Cell = new ItemPrimaryCell(15005, "LiSOCl2Cell", 4, 139500, 1, 1, 5000, "LiSOCl₂");
		LiFeS2Cell = new ItemPrimaryCell(15006, " LiFeS2Cell", 5, 55800, 1, 1, 1000, "LiFeS₂");
		
		MgMnO2Battery2s1p = new ItemPrimaryCell(15011, "MgMnO2Battery2s1p", 16, 15600, 2, 1, 30, "MgMnO₂");
		HgOBattery2s1p = new ItemPrimaryCell(15012, "HgOBattery2s1p", 17, 102000, 2, 1, 40, "HgO");
		AlkalineBattery2s1p = new ItemPrimaryCell(15013, "AlkalineBattery2s1p", 18, 21000, 2, 1, 50, "MnO₂");
		Ag2OBattery2s1p = new ItemPrimaryCell(15014, "Ag2OBattery2s1p", 19, 30000, 2, 1, 250, "Ag₂O");
		LiSOCl2Battery2s1p = new ItemPrimaryCell(15015, "LiSOCl2Battery2s1p", 20, 139500, 2, 1, 5000, "LiSOCl₂");
		LiFeS2Battery2s1p = new ItemPrimaryCell(15016, " LiFeS2Battery2s1p", 21, 55800, 2, 1, 1000, "LiFeS₂");
		
		MgMnO2Battery1s2p = new ItemPrimaryCell(15021, "MgMnO2Battery1s2p", 32, 15600, 1, 2, 30, "MgMnO₂");
		HgOBattery1s2p = new ItemPrimaryCell(15022, "HgOBattery1s2p", 33, 102000, 1,21, 40, "HgO");
		AlkalineBattery1s2p = new ItemPrimaryCell(15023, "AlkalineBattery1s2p", 34, 21000, 2, 1, 50, "MnO₂");
		Ag2OBattery1s2p = new ItemPrimaryCell(15024, "Ag2OBattery1s2p", 35, 30000, 2, 1, 250, "Ag₂O");
		LiSOCl2Battery1s2p = new ItemPrimaryCell(15025, "LiSOCl2Battery1s2p", 36, 139500, 2, 1, 5000, "LiSOCl₂");
		LiFeS2Battery1s2p = new ItemPrimaryCell(15026, " LiFeS2Battery1s2p", 37, 55800, 2, 1, 1000, "LiFeS₂");
		
		MgMnO2Battery2s2p = new ItemPrimaryCell(15031, "MgMnO2Battery2s2p", 48, 15600, 2, 2, 30, "MgMnO₂");
		HgOBattery2s2p = new ItemPrimaryCell(15032, "HgOBattery2s2p", 49, 102000, 2, 2, 40, "HgO");
		AlkalineBattery2s2p = new ItemPrimaryCell(15033, "AlkalineBattery2s2p", 50, 21000, 2, 2, 50, "MnO₂");
		Ag2OBattery2s2p = new ItemPrimaryCell(15034, "Ag2OBattery2s2p", 51, 30000, 2, 2, 250, "Ag₂O");
		LiSOCl2Battery2s2p = new ItemPrimaryCell(15035, "LiSOCl2Battery2s2p", 52, 139500, 2, 2, 5000, "LiSOCl₂");
		LiFeS2Battery2s2p = new ItemPrimaryCell(15036, " LiFeS2Battery2s2p", 53, 55800, 2, 2, 1000, "LiFeS₂");
		 
	}
	
	public static void registerLanguages() {
				
		LanguageRegistry.addName(deadBattery, "Spent Battery");
		LanguageRegistry.addName(thinInoxPlate, "Thin Inox Plate");

		LanguageRegistry.addName(MgMnO2Cell, "Magnesium Oxide Battery");
		LanguageRegistry.addName(HgOCell, "Mercury Oxide Battery");
		LanguageRegistry.addName(AlkalineCell, "Alkaline Battery");
		LanguageRegistry.addName(Ag2OCell, "Silver Oxide Battery");
		LanguageRegistry.addName(LiSOCl2Cell, "Lithium Thionyl Chloride Battery");
		LanguageRegistry.addName(LiFeS2Cell, "Lithium Iron Disulphide Battery");
		
		LanguageRegistry.addName(MgMnO2Battery2s1p, "Magnesium Oxide Battery Pack (2s1p)");
		LanguageRegistry.addName(HgOBattery2s1p, "Mercury Oxide Battery Pack (2s1p)");
		LanguageRegistry.addName(AlkalineBattery2s1p, "Alkaline Battery Pack (2s1p)");
		LanguageRegistry.addName(Ag2OBattery2s1p, "Silver Oxide Battery Pack (2s1p)");
		LanguageRegistry.addName(LiSOCl2Battery2s1p, "Lithium Thionyl Chloride Battery Pack (2s1p)");
		LanguageRegistry.addName(LiFeS2Battery2s1p, "Lithium Iron Disulphide Battery Pack (2s1p)");
		
		LanguageRegistry.addName(MgMnO2Battery1s2p, "Magnesium Oxide Battery Pack (1s2p)");
		LanguageRegistry.addName(HgOBattery1s2p, "Mercury Oxide Battery Pack (1s2p)");
		LanguageRegistry.addName(AlkalineBattery1s2p, "Alkaline Battery Pack (1s2p)");
		LanguageRegistry.addName(Ag2OBattery1s2p, "Silver Oxide Battery Pack (1s2p)");
		LanguageRegistry.addName(LiSOCl2Battery1s2p, "Lithium Thionyl Chloride Battery Pack (1s2p)");
		LanguageRegistry.addName(LiFeS2Battery1s2p, "Lithium Iron Disulphide Battery Pack (1s2p)");
		
		LanguageRegistry.addName(MgMnO2Battery2s2p, "Magnesium Oxide Battery Pack (2s2p)");
		LanguageRegistry.addName(HgOBattery2s2p, "Mercury Oxide Battery Pack (2s2p)");
		LanguageRegistry.addName(AlkalineBattery2s2p, "Alkaline Battery Pack (2s2p)");
		LanguageRegistry.addName(Ag2OBattery2s2p, "Silver Oxide Battery Pack (2s2p)");
		LanguageRegistry.addName(LiSOCl2Battery2s2p, "Lithium Thionyl Chloride Battery Pack (2s2p)");
		LanguageRegistry.addName(LiFeS2Battery2s2p, "Lithium Iron Disulphide Battery Pack (2s2p)");
		
		LanguageRegistry.addName(MgMnO2BoxedCell, "Boxed Magnesium Oxide Battery");
		LanguageRegistry.addName(HgOBoxedCell, "Boxed Mercury Oxide Battery");
		LanguageRegistry.addName(AlkalineBoxedCell, "Boxed Alkaline Battery");
		LanguageRegistry.addName(Ag2OBoxedCell, "Boxed Silver Oxide Battery");
		LanguageRegistry.addName(LiSOCl2BoxedCell, "Boxed Lithium Thionyl Chloride Battery");
		LanguageRegistry.addName(LiFeS2BoxedCell, "Boxed Lithium Iron Disulphide Battery");
	}
}
