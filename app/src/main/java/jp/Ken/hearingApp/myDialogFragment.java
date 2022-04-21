package jp.Ken.hearingApp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class myDialogFragment extends DialogFragment {

    @NonNull
    public AlertDialog onCreateDialog( @Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("加齢性難聴について")
                .setMessage("加齢以外に特別な原因がないものを「加齢性難聴」と呼びます。加齢性難聴は音を感じる部位が障害される感音難聴です。主な原因は、加齢によって、蝸牛の中にある有毛細胞がダメージを受け、その数が減少したり、聴毛が抜け落ちたりすることです。有毛細胞は、音を感知したり、増幅したりする役割がありますので、障害を受けると、音の情報をうまく脳に送ることができないのです。また、内耳の問題以外にも、内耳から脳へと音を伝える神経経路に障害が起きたり、脳の認知能力が低下することも影響している可能性があり、さまざまな原因が複数組み合わされて発生すると考えられています。")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick( DialogInterface dialog, int id) {
                        // このボタンを押した時の処理を書きます。
                    }
                });
        return builder.create();
    }
}
