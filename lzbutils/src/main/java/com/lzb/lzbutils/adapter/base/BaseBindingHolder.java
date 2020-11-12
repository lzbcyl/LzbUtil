package com.lzb.lzbutils.adapter.base;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class BaseBindingHolder<T, B extends ViewDataBinding> extends BaseByViewHolder<T> {

    public final B binding;

    public BaseBindingHolder(ViewGroup viewGroup, int layoutId) {
        super(DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), layoutId, viewGroup, false).getRoot());
        binding = DataBindingUtil.getBinding(this.itemView);
    }

    @Override
    public void onBaseBindView(BaseByViewHolder<T> holder, T bean, int position) {
        onBindingView(this, bean, position);
        binding.executePendingBindings();
    }

    protected abstract void onBindingView(BaseBindingHolder holder, T bean, int position);
}