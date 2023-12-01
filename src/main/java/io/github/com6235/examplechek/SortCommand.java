package io.github.com6235.examplechek;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SortCommand extends Command {
    protected SortCommand(@NotNull String name) {
        super(name);
    }

    public ItemStack[] mainStorage = new ItemStack[] {};
    protected boolean SortInstruments(ItemStack e, List<ItemStack> real, List<ItemStack> fake) {
        boolean isSorted = false;
        switch (e.getType()) {
            case NETHERITE_AXE, DIAMOND_AXE, GOLDEN_AXE, IRON_AXE, STONE_AXE, WOODEN_AXE:
                try {
                    if (real.get(3) == null) {
                        real.set(3, e);
                    } else {
                        fake.add(e);
                    }
                    isSorted = true;
                    break;
                } catch (IndexOutOfBoundsException ignored) {
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.set(3, e);
                    isSorted = true;
                    break;
                }

            case NETHERITE_PICKAXE, DIAMOND_PICKAXE, GOLDEN_PICKAXE, IRON_PICKAXE, STONE_PICKAXE, WOODEN_PICKAXE:
                try {
                    if (real.get(2) == null) {
                        real.set(2, e);
                    } else {
                        fake.add(e);
                    }
                    isSorted = true;
                    break;
                } catch (IndexOutOfBoundsException ignored) {
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.set(2, e);
                    isSorted = true;
                    break;
                }

            case NETHERITE_SWORD, DIAMOND_SWORD, GOLDEN_SWORD, IRON_SWORD, STONE_SWORD, WOODEN_SWORD:
                try {
                    if (real.get(1) == null) {
                        real.set(1, e);
                    } else {
                        fake.add(e);
                    }
                    isSorted = true;
                    break;
                } catch (IndexOutOfBoundsException ignored) {
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.set(1, e);
                    isSorted = true;
                    break;
                }

            case NETHERITE_SHOVEL, DIAMOND_SHOVEL, GOLDEN_SHOVEL, IRON_SHOVEL, STONE_SHOVEL, WOODEN_SHOVEL:
                try {
                    if (real.get(4) == null) {
                        real.set(4, e);
                    } else {
                        fake.add(e);
                    }
                    isSorted = true;
                    break;
                } catch (IndexOutOfBoundsException ignored) {
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.set(4, e);
                    isSorted = true;
                    break;
                }

            case NETHERITE_HOE, DIAMOND_HOE, GOLDEN_HOE, IRON_HOE, STONE_HOE, WOODEN_HOE:
                try {
                    if (real.get(5) == null) {
                        real.set(5, e);
                    } else {
                        fake.add(e);
                    }
                    isSorted = true;
                    break;
                } catch (IndexOutOfBoundsException ignored) {
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.set(5, e);
                    isSorted = true;
                    break;
                }
        }
        return isSorted;
    }

    protected boolean SortArmor(ItemStack e, List<ItemStack> real, List<ItemStack> fake) {
        boolean isSorted = false;
        switch (e.getType()) {
            case NETHERITE_HELMET, DIAMOND_HELMET, GOLDEN_HELMET, IRON_HELMET, CHAINMAIL_HELMET, LEATHER_HELMET, TURTLE_HELMET:
                try {
                    if (real.get(4) == null) {
                        real.set(4, e);
                    } else {
                        fake.add(e);
                    }
                    isSorted = true;
                    break;
                } catch (IndexOutOfBoundsException ignored) {
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.set(4, e);
                    isSorted = true;
                    break;
                }

            case NETHERITE_CHESTPLATE, DIAMOND_CHESTPLATE, GOLDEN_CHESTPLATE, IRON_CHESTPLATE, CHAINMAIL_CHESTPLATE, LEATHER_CHESTPLATE:
                try {
                    if (real.get(3) == null) {
                        real.set(3, e);
                    } else {
                        fake.add(e);
                    }
                    isSorted = true;
                    break;
                } catch (IndexOutOfBoundsException ignored) {
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.set(3, e);
                    isSorted = true;
                    break;
                }

            case NETHERITE_LEGGINGS, DIAMOND_LEGGINGS, GOLDEN_LEGGINGS, IRON_LEGGINGS, CHAINMAIL_LEGGINGS, LEATHER_LEGGINGS:
                try {
                    if (real.get(2) == null) {
                        real.set(2, e);
                    } else {
                        fake.add(e);
                    }
                    isSorted = true;
                    break;
                } catch (IndexOutOfBoundsException ignored) {
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.set(2, e);
                    isSorted = true;
                    break;
                }

            case NETHERITE_BOOTS, DIAMOND_BOOTS, GOLDEN_BOOTS, IRON_BOOTS, CHAINMAIL_BOOTS, LEATHER_BOOTS:
                try {
                    if (real.get(1) == null) {
                        real.set(1, e);
                    } else {
                        fake.add(e);
                    }
                    isSorted = true;
                    break;
                } catch (IndexOutOfBoundsException ignored) {
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.set(1, e);
                    isSorted = true;
                    break;
                }

            case SHIELD:
                try {
                    if (real.get(5) == null) {
                        real.set(5, e);
                    } else {
                        fake.add(e);
                    }
                    isSorted = true;
                    break;
                } catch (IndexOutOfBoundsException ignored) {
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.add(null);
                    real.set(5, e);
                    isSorted = true;
                    break;
                }
        }

        return isSorted;
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {
        mainStorage = Objects.requireNonNull(Bukkit.getPlayer(sender.getName())).getInventory().getContents();
        List<ItemStack> blockStack = new ArrayList<>() {};
        List<ItemStack> itemStack = new ArrayList<>() {};
        List<ItemStack> instrumentStack = new ArrayList<>() {};
        List<ItemStack> secondInstrumentStack = new ArrayList<>() {};
        List<ItemStack> armorShieldStack = new ArrayList<>() {};
        List<ItemStack> secondArmorShieldStack = new ArrayList<>() {};

        List<ItemStack> realStack = new ArrayList<>() {};

        for (ItemStack element : mainStorage) {
            if (element != null) {
                if (element.getType().isBlock()) {
                    blockStack.add(element);
                } else if (element.getType().isItem()) {
                    boolean s = SortInstruments(element, instrumentStack, secondInstrumentStack);
                    boolean a = SortArmor(element, armorShieldStack, secondArmorShieldStack);
                    if (!s && !a) {
                        itemStack.add(element);
                    }
                }
            }
        }


        realStack.addAll(instrumentStack);
        realStack.addAll(blockStack);
        realStack.addAll(itemStack);
        realStack.addAll(secondInstrumentStack);
        realStack.addAll(secondArmorShieldStack);
        realStack.removeIf(Objects::isNull);
        realStack.addAll(realStack.size(),armorShieldStack);
        for (int i = 0; i < 42 - realStack.size(); i++) {
            realStack.add(realStack.size() - 5, null);
        }
        /*sender.sendMessage(Arrays.toString(realStack.toArray(new ItemStack[41])));*/
        Objects.requireNonNull(Bukkit.getPlayer(sender.getName())).getInventory().setContents(realStack.toArray(new ItemStack[41]));
        return false;
    }
}
