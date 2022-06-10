import crafttweaker.item.IItemStack;

import mods.chisel.Carving;

val DefaultAndWroughtIron = <ore:plateIron> | <ore:plateWroughtIron>;
val AllQuartzTypes = <ore:gemCertusQuartz> | <ore:gemQuartzite> | <ore:gemNetherQuartz>;

// --- Removing Recipes

// Удаление рецептов
val RemoveWorkbenchRecipes as IItemStack[] = [
	<chisel:chisel_iron>,
	<chisel:chisel_diamond>,
	<chisel:chisel_hitech>,
	<chisel:tyrian>,
	<chisel:laboratory>,
	<chisel:temple>,
	<chisel:factory>,
	<chisel:brownstone>,
	// Glass
	<chisel:glasspane>,
	<chisel:glasspane:1>,
	<chisel:glasspane:2>,
	<chisel:glasspane:3>,
	<chisel:glasspane:4>,
	<chisel:glasspane:6>,
	<chisel:glasspane:7>,
	<chisel:glasspane:8>,
	<chisel:glasspane:9>,
	<chisel:glasspane:10>,
	<chisel:glasspane:10>,
	<chisel:glasspane:11>,
	<chisel:glasspane:12>,
	<chisel:glasspane:13>,
	<chisel:glasspane:14>,
	<chisel:glasspane:15>,
	<chisel:glasspane1>,
	<chisel:glasspane1:1>,
	<chisel:glasspanedyedbrown:*>,
	<chisel:glasspanedyedcyan:*>,
	<chisel:glasspanedyedyellow:*>,
	<chisel:glasspanedyedlightblue:*>,
	<chisel:glasspanedyedblack:*>,
	<chisel:glasspanedyedblue:*>,
	<chisel:glasspanedyedgray:*>,
	<chisel:glasspanedyedwhite:*>,
	<chisel:glasspanedyedred:*>,
	<chisel:glasspanedyedlightgray:*>,
	<chisel:glasspanedyedpink:*>,
	<chisel:glasspanedyedorange:*>,
	<chisel:glasspanedyedgreen:*>,
	<chisel:glasspanedyedpurple:*>,
	<chisel:glasspanedyedlime:*>,
	<chisel:glasspanedyedmagenta:*>
] as IItemStack[];
for item in RemoveWorkbenchRecipes {
    recipes.remove(item);
}

// Поименное удаление рецептов
val RemoveItemRecipesByName = [
    "chisel:uncraft_blockiron",
	"chisel:uncraft_blockgold",
	"chisel:emerald",
	"chisel:diamond",
	"chisel:redstone",
	"chisel:coal"
] as string[];
for item in RemoveItemRecipesByName{
    recipes.removeByRecipeName(item);
}

// --- Adding Recipes

// Железная стамеска
recipes.addShaped(<chisel:chisel_iron>,
[[null, <ore:plateWroughtIron>, null],
 [null, <ore:chisel>, null],
 [null, <ore:stickWood>, null]]);

// Алмазная стамеска
recipes.addShaped(<chisel:chisel_diamond>,
[[null, <ore:plateDiamond>, null],
 [null, <ore:chisel>, null],
 [null, <ore:stickWood>, null]]);

// Современная стамеска
recipes.addShaped(<chisel:chisel_hitech>,
[[null, <ore:plateBlueSteel>, null],
 [null, <chisel:chisel_diamond>, null],
 [null, <ore:stickWood>, null]]);
 
// Лабораторный блок
recipes.addShaped(<chisel:laboratory> * 8,
[[<ore:stone>, <ore:stone>, <ore:stone>],
 [<ore:stone>, AllQuartzTypes, <ore:stone>],
 [<ore:stone>, <ore:stone>, <ore:stone>]]);
 
// Храмовый блок
recipes.addShaped(<chisel:temple> * 8,
[[<ore:stone>, <ore:stone>, <ore:stone>],
 [<ore:stone>, <ore:dyeCyan>, <ore:stone>],
 [<ore:stone>, <ore:stone>, <ore:stone>]]);
 
// Тириан блок
recipes.addShaped(<chisel:tyrian> * 8,
[[<ore:stone>, <ore:stone>, <ore:stone>],
 [<ore:stone>, DefaultAndWroughtIron, <ore:stone>],
 [<ore:stone>, <ore:stone>, <ore:stone>]]);
 
// Фактори блок
recipes.addShaped(<chisel:factory> * 8,
[[DefaultAndWroughtIron, <ore:stone>, DefaultAndWroughtIron],
 [<ore:stone>, null, <ore:stone>],
 [DefaultAndWroughtIron, <ore:stone>, DefaultAndWroughtIron]]);
 
// Бровн стоун
recipes.addShaped(<chisel:brownstone> * 8,
[[<ore:sand>, <ore:sand>, <ore:sand>],
 [<ore:sand>, <minecraft:clay_ball>, <ore:sand>],
 [<ore:sand>, <ore:sand>, <ore:sand>]]);