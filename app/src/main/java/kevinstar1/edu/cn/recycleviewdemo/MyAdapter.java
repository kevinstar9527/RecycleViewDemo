package kevinstar1.edu.cn.recycleviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/3/8.
 */
class MyAdapter extends RecyclerView.Adapter {

    //自定义内部类viewHolder
    class ViewHolder extends RecyclerView.ViewHolder {

        private View root;

        private  TextView title;
        private TextView content;

        public ViewHolder(View root) {
            super(root);
            title=(TextView)root.findViewById(R.id.txtTitle);
            content=(TextView)root.findViewById(R.id.txtContent);

            //viewHolder与TextView进行关联
        }

        public TextView getTitle() {
            return title;
        }

        public void setTitle(TextView title) {
            this.title = title;
        }

        public TextView getContent() {
            return content;
        }

        public void setContent(TextView content) {
            this.content = content;
        }

        //  public TextView getTv() {
           // return tv;
        //}
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.listcell,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {

        ViewHolder vh = (ViewHolder) holder;
        vh.getTitle().setText(data[i].title);
        vh.getContent().setText(data[i].content);
        //vh.getTv().setText("item" + position);

    }

    private CellData[] data={new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("黄星根","kevin"),new CellData("Good Job","nice move")};

    @Override
    public int getItemCount() {
        return data.length;//表示要创建的RecycleView的子对象有十个
    }
}
