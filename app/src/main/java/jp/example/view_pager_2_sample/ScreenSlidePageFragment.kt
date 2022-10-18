package jp.example.view_pager_2_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import jp.example.view_pager_2_sample.databinding.FragmentScreenSlidePageBinding

class ScreenSlidePageFragment : Fragment() {
    private var _binding: FragmentScreenSlidePageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate<FragmentScreenSlidePageBinding>(
            inflater,
            R.layout.fragment_screen_slide_page,
            container,
            false,
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = "ViewPager2 オブジェクトには、ページ遷移用のビルトイン スワイプ ジェスチャーが用意されており、デフォルトで画面スライド アニメーションが表示されるため、独自のアニメーションを作成する必要はありません。ViewPager2 は、表示する新しいページの供給源として FragmentStateAdapter オブジェクトを使用します。そのため、FragmentStateAdapter は、先ほど作成したフラグメント クラスを使用します。\n" +
                "\n" +
                "まず、ViewPager2 オブジェクトを含むレイアウトを作成します。\n" +
                "\n" +
                "以下の処理を行うアクティビティを作成します。\n" +
                "\n" +
                "ViewPager2 を使用して、レイアウト用のコンテンツ ビューを設定します。\n" +
                "FragmentStateAdapter 抽象クラスを拡張するクラスを作成し、createFragment() メソッドを実装して ScreenSlidePageFragment のインスタンスを新しいページとして供給します。また、ページャー アダプターを利用するには、getItemCount() メソッドを実装する必要があります。このメソッドは、アダプターが作成するページの数を返します（今回の例では 5）。\n" +
                "FragmentStateAdapter を ViewPager2 オブジェクトに接続します。\n"
    }
}