package io.github.com6235.examplechek;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SortCommand extends Command {
    protected SortCommand(@NotNull String name, @NotNull String description, @NotNull String usageMessage, @NotNull List<String> aliases) {
        super(name, description, usageMessage, aliases);
    }

    public List<ItemStack> hotbar = new ArrayList<>();
    public List<ItemStack> inventory = new ArrayList<>();
    public List<ItemStack> sortedHotbar = new ArrayList<>();
    public List<ItemStack> sortedInventory = new ArrayList<>();
    public List<ItemStack> sorted = new ArrayList<>();

    public void sort(List<ItemStack> srt, List<ItemStack> toSort, CommandSender sender) {
        ItemStack prev = null;
        List<ItemStack> unsorted = new ArrayList<>();
        for (int idx = 0; idx < toSort.size(); idx++) {
            ItemStack i = toSort.get(idx);
            if (prev == null) {
                prev = i;
                srt.add(i);
                sender.sendMessage("Prev - null");
            } else if (prev.getType() == i.getType()) {
                srt.add(i);
                sender.sendMessage("Sorted: %s".formatted(i));
            } else if (prev.getType() != i.getType()) {
                unsorted.add(i);
                sender.sendMessage("UnSorted: %s".formatted(i));
            }
        }
        if (!unsorted.isEmpty()) {
            sort(srt, unsorted, sender);
        }
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {
        // Сброс переменных
        sortedInventory = new ArrayList<>();
        sortedHotbar = new ArrayList<>();
        sorted = new ArrayList<>();
        inventory = new ArrayList<>();
        hotbar = new ArrayList<>();
        // Получение инвентаря
        ItemStack[] mainStorage = Objects.requireNonNull(Bukkit.getPlayer(sender.getName())).getInventory().getStorageContents();
        // инит
        List<ItemStack> hb_blockStack = new ArrayList();
        List<ItemStack> hb_itemStack = new ArrayList<>();
        List<ItemStack> iv_blockStack = new ArrayList();
        List<ItemStack> iv_itemStack = new ArrayList<>();
        // Расфасовка
        hotbar = List.of(Arrays.copyOfRange(mainStorage, 0, 9));
        sender.sendMessage(Arrays.toString(mainStorage));
        sender.sendMessage(String.valueOf(mainStorage.length));
        for (int indexer = 9; indexer < mainStorage.length; indexer++) {
            if (mainStorage[indexer] != null) {
                inventory.add(mainStorage[indexer]);
                sender.sendMessage(String.valueOf(inventory.size()));
            }
        }
        // сортировка
        for (ItemStack element : hotbar) {
            if (element != null) {
                if (element.getType().isBlock()) {
                    hb_blockStack.add(element);
                } else if (element.getType().isItem()) {
                    hb_itemStack.add(element);
                }
            }
        }
        sort(sortedHotbar, hb_blockStack, sender);
        sort(sortedHotbar, hb_itemStack, sender);
        for (ItemStack element : inventory) {
            if (element != null) {
                if (element.getType().isBlock()) {
                    iv_blockStack.add(element);
                } else if (element.getType().isItem()) {
                    iv_itemStack.add(element);
                }
            }
        }
        sort(sortedInventory, iv_blockStack, sender);
        sort(sortedInventory, iv_itemStack, sender);

        sender.sendMessage(Arrays.toString(sortedHotbar.toArray(new ItemStack[9])));
        sender.sendMessage(Arrays.toString(sortedInventory.toArray(new ItemStack[26])));

        sender.sendMessage(String.valueOf(sortedHotbar.size()));
        sender.sendMessage(String.valueOf(sortedInventory.size()));
        // Соединение отсортированных хотбара и инвентаря
        sorted.addAll(sortedHotbar);
        sorted.addAll(sortedInventory);
        Objects.requireNonNull(Bukkit.getPlayer(sender.getName())).getInventory().setContents(sorted.toArray(new ItemStack[41]));
        return false;
    }
}
