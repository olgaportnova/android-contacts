package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<C extends ListDiffInterface<C>> extends DiffUtil.ItemCallback<C> {

    @Override
    public boolean areItemsTheSame(@NonNull C oldItem, @NonNull C newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull C oldItem, @NonNull C newItem) {
        return oldItem.equals(newItem);
    }

    @Override
    public Object getChangePayload(@NonNull C oldItem, @NonNull C newItem) {
        return newItem;
    }
}