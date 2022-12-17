package betterelectrics.main.handlers;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import betterelectrics.main.blocks.Blocks;
import betterelectrics.main.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingHandler {

	public static void AddCraftings() {
		try {

		GameRegistry.addShapelessRecipe(new ItemStack(Items.MgMnO2Cell), new Object[] { new ItemStack(Items.MgMnO2BoxedCell)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.HgOCell), new Object[] { new ItemStack(Items.HgOBoxedCell)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.AlkalineCell), new Object[] { new ItemStack(Items.AlkalineBoxedCell)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Ag2OCell), new Object[] { new ItemStack(Items.Ag2OBoxedCell)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.LiSOCl2Cell), new Object[] { new ItemStack(Items.LiSOCl2BoxedCell)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.LiFeS2Cell), new Object[] { new ItemStack(Items.LiFeS2BoxedCell)});
			
		GregtechCompat.addBenderRecipe(GregtechCompat.getGregTechItem(0, 1, 66), new ItemStack(Items.thinInoxPlate, 16), 60, 10);
			
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.MgMnO2BoxedCell, 8), 
				new Object [] {" W ", "IMI", "IGI",
						'W', "nuggetCopper",
						'I', new ItemStack(Items.thinInoxPlate, 1),
						'M', "dustSmallMagnesium",
						'G', "dustSmallManganese"
						});
		
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.HgOBoxedCell, 8), 
				new Object [] {" W ", "IZI", "IHI",
						'W', "nuggetCopper",
						'I', new ItemStack(Items.thinInoxPlate, 1),
						'H', "molecule_1hg",
						'Z', "ingotZinc"
						});
		
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.AlkalineBoxedCell, 8), 
				new Object [] {" W ", "IZI", "IGI",
						'W', "nuggetCopper",
						'I', new ItemStack(Items.thinInoxPlate, 1),
						'Z', "ingotZinc",
						'G', "dustSmallManganese"
						});
		
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.Ag2OBoxedCell, 8), 
				new Object [] {" W ", "IZI", "ISI",
						'W', "nuggetCopper",
						'I', new ItemStack(Items.thinInoxPlate, 1),
						'Z', "ingotZinc",
						'S', "ingotSilver"
						});
		
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.LiSOCl2BoxedCell, 8), 
				new Object [] {" W ", "CSC", "ILI",
						'W', "nuggetCopper",
						'I', new ItemStack(Items.thinInoxPlate, 1),
						'C', "molecule_1cl",
						'S', "molecule_1s",
						'L', "molecule_1li"
						});
		
		CraftingHelpers.addShapedOreRecipe(new ItemStack(Items.LiFeS2BoxedCell, 8), 
				new Object [] {" W ", "FSF", "ILI",
						'W', "nuggetCopper",
						'I', new ItemStack(Items.thinInoxPlate, 1),
						'F', "ingotIron",
						'S', "molecule_1s",
						'L', "molecule_1li"
						});
		
		} catch(Exception e) {
			System.err.println("Errore durante l'aggiunta di ricette di celle primarie: " + e);
		}
		
		try {
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.MgMnO2Battery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.MgMnO2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.HgOBattery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.HgOCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.AlkalineBattery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.AlkalineCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.Ag2OBattery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.Ag2OCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiSOCl2Battery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.LiSOCl2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiFeS2Battery1s2p),
					new Object[] { "WW ", "BB ", "WW ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.LiFeS2Cell)
					});
			
			
		} catch(Exception e) {
			System.err.println("Errore durante l'aggiunta di ricette di configurazione 1s2p: " + e);
		}
		
		try {
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.MgMnO2Battery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.MgMnO2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.HgOBattery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.HgOCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.AlkalineBattery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.AlkalineCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.Ag2OBattery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.Ag2OCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiSOCl2Battery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.LiSOCl2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiFeS2Battery2s1p),
					new Object[] { "WB ", "WB ", "   ",
							'W', ic2.api.Items.getItem("tinCableItem"),
							'B', new ItemStack(Items.LiFeS2Cell)
					});
			
		} catch(Exception e) {
			System.err.println("Errore durante l'aggiunta di ricette di configurazione 2s1p: " + e);
		}
		
		try {
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.MgMnO2Battery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.MgMnO2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.HgOBattery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.HgOCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.AlkalineBattery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.AlkalineCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.Ag2OBattery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.Ag2OCell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiSOCl2Battery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.LiSOCl2Cell)
					});
			
			ic2.api.Ic2Recipes.addCraftingRecipe(new ItemStack(Items.LiFeS2Battery2s2p),
					new Object[] { "BB ", "BB ", "   ",
							'B', new ItemStack(Items.LiFeS2Cell)
					});
			
		} catch(Exception e) {
			System.err.println("Errore durante l'aggiunta di ricette di configurazione 2s2p: " + e);
		}
		
		try {
			GregtechCompat.addCentrifugeRecipe(new ItemStack(Items.deadBattery, 64), 0,
					new ItemStack(Item.ingotIron, 64),
					GregtechCompat.getGregTechItem(1, 8, 244),
					GregtechCompat.getGregTechItem(1, 4, 243), 
					GregtechCompat.getGregTechItem(1, 2, 12)
					, 200);
		} catch (Exception e) {
			System.err.println("Gregtech di merda, errore gregtech, gregorius suca.");
		}
	}
}
