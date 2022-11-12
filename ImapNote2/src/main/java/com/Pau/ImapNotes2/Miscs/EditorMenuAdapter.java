package com.Pau.ImapNotes2.Miscs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.Pau.ImapNotes2.R;

public class EditorMenuAdapter extends ArrayAdapter<String> {
    @NonNull
    private final LayoutInflater mInflater;
    private final int mSpinnerResourceId;
    private final Context mContext;


    public EditorMenuAdapter(Context context, int textViewResourceId, String[] objects,
                             int spinnerResourceId) {
        super(context, textViewResourceId, objects);

        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mSpinnerResourceId = spinnerResourceId;
        mContext = context;

// TODO Auto-generated constructor stub
    }

    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {
// TODO Auto-generated method stub
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
// TODO Auto-generated method stub
        return getCustomView(position, convertView, parent);
    }


    public View getCustomView(int position, View convertView, ViewGroup parent) {
// TODO Auto-generated method stub
//return super.getView(position, convertView, parent);

        View row = mInflater.inflate(R.layout.editor_row, parent, false);
        ImageView icon = row.findViewById(R.id.cmd_icon);
            /*
            row.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           switch (mSpinnerResourceId) {
                                               case R.id.action_format:
                                                   switch (position) {
                                                       case 0:
                                                           mEditor.setBold();
                                                       case 1:
                                                           mEditor.setItalic();
                                                   }
                                           }
                                       }


                                   });
        //row.setOnLongClickListener(v -> mEditor.setItalic());
*/
        switch (mSpinnerResourceId) {
            case R.id.action_format:
                switch (position) {
                    case 0:
                        row.setId(R.id.action_bold);
                        icon.setImageResource(R.drawable.bold);
                        break;
                    case 1:
                        row.setId(R.id.action_italic);
                        icon.setImageResource(R.drawable.italic);
                        break;
                    case 2:
                        row.setId(R.id.action_subscript);
                        icon.setImageResource(R.drawable.subscript);
                        break;
                    case 3:
                        row.setId(R.id.action_superscript);
                        icon.setImageResource(R.drawable.superscript);
                        break;
                    case 4:
                        row.setId(R.id.action_strikethrough);
                        icon.setImageResource(R.drawable.strikethrough);
                        break;
                    case 5:
                        row.setId(R.id.action_underline);
                        icon.setImageResource(R.drawable.underline);
                        break;
                }
                break;
            case R.id.action_heading:
                switch (position) {
                    case 0:
                        row.setId(R.id.action_insert_bullets);
                        icon.setImageResource(R.drawable.bullets);
                        break;
                    case 1:
                        row.setId(R.id.action_insert_numbers);
                        icon.setImageResource(R.drawable.numbers);
                        break;
                    case 2:
                        row.setId(R.id.action_heading1);
                        icon.setImageResource(R.drawable.h1);
                        break;
                    case 3:
                        row.setId(R.id.action_heading2);
                        icon.setImageResource(R.drawable.h2);
                        break;
                    case 4:
                        row.setId(R.id.action_heading3);
                        icon.setImageResource(R.drawable.h3);
                        break;
                    case 5:
                        row.setId(R.id.action_heading4);
                        icon.setImageResource(R.drawable.h4);
                        break;
                    case 6:
                        row.setId(R.id.action_heading5);
                        icon.setImageResource(R.drawable.h5);
                        break;
                    case 7:
                        row.setId(R.id.action_heading6);
                        icon.setImageResource(R.drawable.h6);
                        break;
                }
                break;
            case R.id.action_txt_color:
                switch (position) {
                    case 0:
                        row.setId(R.id.action_txt_color_white);
                        icon.setImageResource(R.drawable.txt_color_white);
                        break;
                    case 1:
                        row.setId(R.id.action_txt_color_grey);
                        icon.setImageResource(R.drawable.txt_color_grey);
                        break;
                    case 2:
                        row.setId(R.id.action_txt_color_black);
                        icon.setImageResource(R.drawable.txt_color_black);
                        break;
                    case 3:
                        row.setId(R.id.action_txt_color_red);
                        icon.setImageResource(R.drawable.txt_color_red);
                        break;
                    case 4:
                        row.setId(R.id.action_txt_color_green);
                        icon.setImageResource(R.drawable.txt_color_green);
                        break;
                    case 5:
                        row.setId(R.id.action_txt_color_yellow);
                        icon.setImageResource(R.drawable.txt_color_yellow);
                        break;
                    case 6:
                        row.setId(R.id.action_txt_color_blue);
                        icon.setImageResource(R.drawable.txt_color_blue);
                        break;
                    case 7:
                        row.setId(R.id.action_txt_color_brown);
                        icon.setImageResource(R.drawable.txt_color_brown);
                        break;
                }
                break;
            case R.id.action_bg_color:
                switch (position) {
                    case 0:
                        row.setId(R.id.action_bg_color_white);
                        icon.setImageResource(R.drawable.bg_color_white);
                        break;
                    case 1:
                        row.setId(R.id.action_bg_color_grey);
                        icon.setImageResource(R.drawable.bg_color_grey);
                        break;
                    case 2:
                        row.setId(R.id.action_bg_color_black);
                        icon.setImageResource(R.drawable.bg_color_black);
                        break;
                    case 3:
                        row.setId(R.id.action_bg_color_red);
                        icon.setImageResource(R.drawable.bg_color_red);
                        break;
                    case 4:
                        row.setId(R.id.action_bg_color_green);
                        icon.setImageResource(R.drawable.bg_color_green);
                        break;
                    case 5:
                        row.setId(R.id.action_bg_color_yellow);
                        icon.setImageResource(R.drawable.bg_color_yellow);
                        break;
                    case 6:
                        row.setId(R.id.action_bg_color_blue);
                        icon.setImageResource(R.drawable.bg_color_blue);
                        break;
                    case 7:
                        row.setId(R.id.action_bg_color_brown);
                        icon.setImageResource(R.drawable.bg_color_brown);
                        break;
                }
                break;
            case R.id.action_alignment:
                switch (position) {
                    case 0:
                        row.setId(R.id.action_indent);
                        icon.setImageResource(R.drawable.indent);
                        break;
                    case 1:
                        row.setId(R.id.action_outdent);
                        icon.setImageResource(R.drawable.outdent);
                        break;
                    case 2:
                        row.setId(R.id.action_align_left);
                        icon.setImageResource(R.drawable.justify_left);
                        break;
                    case 3:
                        row.setId(R.id.action_align_center);
                        icon.setImageResource(R.drawable.justify_center);
                        break;
                    case 4:
                        row.setId(R.id.action_align_right);
                        icon.setImageResource(R.drawable.justify_right);
                        break;
                    case 5:
                        row.setId(R.id.action_blockquote);
                        icon.setImageResource(R.drawable.blockquote);
                        break;
                }
                break;
            case R.id.action_insert:
                switch (position) {
 /*                   case 0:
                        row.setId(R.id.action_insert_image);
                        icon.setImageResource(R.drawable.insert_image);
                        break;
                    case 1:
                        row.setId(R.id.action_insert_link);
                        icon.setImageResource(R.drawable.insert_link);
                        break;
                    case 2:
                        row.setId(R.id.action_insert_checkbox);
                        icon.setImageResource(R.drawable.checkbox);
                        break;
 */
                    case 0:
                        row.setId(R.id.action_insert_star);
                        icon.setImageResource(R.drawable.star);
                        break;
                    case 1:
                        row.setId(R.id.action_insert_exclamation);
                        icon.setImageResource(R.drawable.exclamation);
                        break;
                    case 2:
                        row.setId(R.id.action_insert_question);
                        icon.setImageResource(R.drawable.question);
                        break;
                    case 3:
                        row.setId(R.id.action_insert_hline);
                        icon.setImageResource(R.drawable.hline);
                        break;

                }
        }
        return row;
    }
}
