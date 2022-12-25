package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<C> extends DiffUtil.ItemCallback <BaseListDiffCallback<C>> implements ListDiffInterface<BaseListDiffCallback<C>> {


    @Override
    public boolean areItemsTheSame(@NonNull BaseListDiffCallback<C> oldItem, @NonNull BaseListDiffCallback<C> newItem) {
        return false;
    }

    @Override
    public boolean areContentsTheSame(@NonNull BaseListDiffCallback<C> oldItem, @NonNull BaseListDiffCallback<C> newItem) {
        return false;
    }

    @Override
    public boolean theSameas(BaseListDiffCallback<C> baseListDiffCallback) {
        return false;
    }
}
